
/*Questão 04: Faça um algoritmo que calcule e mostre a tabuada de uma operaçãomatemáticaque deverá ser informada pelo usuário (+, -, * e /) além do número digitado pelo usuárioparaocalculo da operação. 
OBS: use a funcao abs() na subtracao para forçar o resultado ser sempre positivo. Exemplo: (5-9) resultará em -4
abs(5-9) resultará em 4 */
import java.util.Scanner;

public class Questao4 {
	public static int LerNumero() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("informe o número para calcular a tabuada: ");
		return teclado.nextInt();
	}

	public static char LerOperacao() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a operação desejada [+, - , * , /]:");
		return teclado.next().charAt(0);
	}

	public static void CalcularSoma(int num, int cont, int soma) {
		soma = (num + cont);
		soma = Math.abs(soma);
		System.out.println(num + " + " + cont + " = " + soma);
	}

	public static void CalcularSubtracao(int num, int cont, int sub) {
		sub = (num - cont);
		sub = Math.abs(sub);
		System.out.println(num + " - " + cont + " = " + sub);
	}

	public static void CacularMultiplicao(int num, int cont, int mult) {
		mult = (num * cont);
		mult = Math.abs(mult);
		System.out.println(num + " x " + cont + " = " + mult);
	}

	public static void CacularDivisao(int num, int cont, float div) {
		try {
			div = (num / cont);
			div = Math.abs(div);
			System.out.println(num + " / " + cont + " = " + div);

		} catch (java.lang.ArithmeticException erro) {
			System.out.println("Não existe divisão por zero!");
		}

	}

	public static void main(String[] args) {

		int num;
		int soma = 0;
		int sub = 0;
		int mult = 0;
		float div = 0;

		try {
			char operacao = LerOperacao();
			num = LerNumero();
			System.out.println();

			if (operacao == '+') {
				System.out.println("Está é a tabuada de soma para o número " + num);
				for (int i = 0; i <= 10; i++) {
					CalcularSoma(num, i, soma);

				}

			} else if (operacao == '-') {
				System.out.println("Está é a tabuada de subtração para o número " + num);
				for (int i = 0; i <= 10; i++) {
					CalcularSubtracao(num, i, sub);

				}

			} else if (operacao == '*') {
				System.out.println("Está é a tabuada de multiplicação para o número " + num);
				for (int i = 0; i <= 10; i++) {
					CacularMultiplicao(num, i, mult);

				}

			} else if (operacao == '/') {
				System.out.println("Está é a tabuada de divisão para o número " + num);
				for (int i = 0; i <= 10; i++) {
					CacularDivisao(num, i, div);

				}

			} else {
				System.out.print(
						"O tipo de operação não foi informada corretamente, por favor, escreva apenas [+,-,*,/] para as operações");
			}
		} catch (java.util.InputMismatchException erro) {
			System.out.print("Informe apenas números para o calculo!");
		}

	}
}
