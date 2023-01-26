
/*Questão 07: Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado. 
c) Uma mensagem “Você deve procurar uma nutricionista” se a diferença de acréscimodepeso(15%) entre o acréscimo de peso (20%) for maior ou igual a 4,5 kgs */
import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double peso, engorde, emagreca, diferenca = 0;

		System.out.print("Digite seu peso:");
		peso = teclado.nextFloat();

		engorde = peso + (peso * 0.15);
		emagreca = peso - (peso * 0.2);

		System.out.println("Caso engorde 15% ficara com: " + engorde);
		System.out.println("Caso emagreça 20% ficara com: " + emagreca);
		if (engorde >= emagreca) {
			diferenca = (engorde - emagreca);
		} else {
			diferenca = (emagreca - engorde);
		}

		if (diferenca >= 4.5) {
			System.out.println("Você deve procurar uma nutricionista!");

		}

	}
}
