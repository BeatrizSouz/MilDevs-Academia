
/*Questão 05: Faça um algoritmo que receba dois números inteiros, calcule e mostre adivisãododo maior número pelo menor número. 
Sabe-se que o segundo número não pode ser zero, destaforma se o usuário digitar 0 deverá ser exibido uma mensagem “A operação nãopodeserrealizada ”
OBS: Para forçar uma divisão de dois números inteiro produzir um resultado fracionário, utilizamosa palavra float entre parênteses. 
Exemplo: (a/(float)b). Neste caso, forçamos ocompiladorentender que a variavel b apesar de ser inteira deve ser convertida para float */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int A = 0;
		int B = 0;

		try {
			System.out.print("Infome o primeiro número:");
			A = teclado.nextInt();
			System.out.print("Informe o segundo número:");
			B = teclado.nextInt();
		} catch (java.util.InputMismatchException erro) {
			System.out.println("insira apenas números!");
		}

		if (B == 0) {
			System.out.print("A operação não pode ser realizada:");
		} else if (A < B) {
			float div = B / (float) A;
			System.out.print("A divisão de " + B + " por " + A);
			System.out.println(" é : " + df.format(div));
		} else {
			float div = A / (float) B;
			System.out.print("A divisão de " + A + " por " + B);
			System.out.println(" é : " + df.format(div));
		}
	}
}
