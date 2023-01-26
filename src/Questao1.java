
/*Questão 01: Uma imobiliária vende apenas terrenos retangulares. 
Faça umalgoritmoparaimprimir a área do terreno e o valor de venda do mesmo. 
Para isto será necessárioousuárioinformar as dimensões em metros (frente e lateral) do terreno além do valor cobradopelometroquadrado. 
Caso a diferença de metragem entre a frente e a lateral seja menor que10%dametragem da frente, o cliente terá um acréscimo de 22% no valor final do terreno. 
Caso a metragem da frente for menor que 40% da lateral, o cliente terá umdescontode12%novalor final do terreno. 
]Caso a metragem da frente for maior que 70% da lateral, o clienteteráumdesconto de 15%. 
Caso as medidas não encaixem em nenhuma das regras o valor final doterreno não sofrerá alterações. 
OBS: Para o cálculo absoluto de uma subtração de valores fracionários é necessárioutilizarofabs() ao invés de somente abs() que é específico para subtração de números inteiros. */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao1 {
	public static void Informacao(float terrenofrente, float terrenolateral, float arearetan) {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println();
		System.out.print("A área total do terreno com " + df.format(terrenofrente) + " mts de frente e com "
				+ df.format(terrenolateral));
		System.out.print(" mts de lateral é: " + df.format(arearetan) + " mts \n");
		System.out.println();
	}

	public static void Verificacao(float terrenofrente, float terrenolateral, float ValorFinal) {
		DecimalFormat df = new DecimalFormat("0.00");

		if (Math.abs(terrenofrente - terrenolateral) < (terrenofrente * 0.1f)) {
			System.out.println("O terreno recebeu  um acrecimo de 22% e custará: R$" + df.format(ValorFinal * 1.22f));
		} else if ((terrenofrente) < (terrenolateral * 0.4f)) {
			System.out.println("O terreno recebeu um desconto de 12% e custará: R$"
					+ df.format(ValorFinal - (ValorFinal * 0.12f)));

		} else if ((terrenofrente) > (terrenolateral * 0.7f)) {
			System.out.println("O terreno recebeu um desconto de 15% e custará: R$"
					+ df.format(ValorFinal - (ValorFinal * 0.15f)));

		} else {
			System.out.print("O terreno não sofreu nenhuma alteração e custará: R$" + df.format(ValorFinal));
		}

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float terrenofrente, terrenolateral, valormetro, arearetan, ValorFinal;// float = tipo real

		System.out.print("Quantos metros o terreno possui de frente:");
		terrenofrente = teclado.nextFloat();

		System.out.print("Quantos metros o terreno possui de lateral:");
		terrenolateral = teclado.nextFloat();

		System.out.print("Informe o valor cobrado pelo metro quadrado:");
		valormetro = teclado.nextFloat();

		arearetan = (terrenofrente * terrenolateral);
		ValorFinal = (arearetan * valormetro);

		Informacao(terrenofrente, terrenolateral, arearetan);

		Verificacao(terrenofrente, terrenolateral, ValorFinal);

	}
}
