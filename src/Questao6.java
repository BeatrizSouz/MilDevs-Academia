
/*Questão 06: Faça um algoritmo para calcular quantas ferraduras são necessárias paraequipartodos os cavalos comprados para um haras. 
O usuário devera informar a quantidadedecavalosadquiridos e o valor de cada ferradura. 
Aplique um desconto no valor total conformeatabeladedescontos: */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int Cavalo = 0;
		int Qtdferradura = 0;
		double ValorFerradura = 0;
		double ValorTotal = 0;

		System.out.print("Informe a quantidade de cavalos:");
		Cavalo = teclado.nextInt();
		System.out.print("Informe o valor de cada ferradura: R$");
		ValorFerradura = teclado.nextDouble();

		Qtdferradura = Cavalo * 4;
		ValorTotal = Qtdferradura * ValorFerradura;
		System.out.println("Quantidade de ferraduras necessarias:" + Qtdferradura);
		System.out.println();

		if (ValorTotal >= 15000.01 && ValorTotal <= 20000.00) {
			ValorTotal = ValorTotal - (ValorTotal * 0.10);
			System.out.println("O valor total para a compra de ferraduras: R$" + df.format(ValorTotal));
		} else if (ValorTotal >= 20000.01 && ValorTotal <= 25000.00) {
			ValorTotal = ValorTotal - (ValorTotal * 0.12);
			System.out.println("O valor total para a compra de ferraduras: R$" + df.format(ValorTotal));
		} else if (ValorTotal >= 25000.01 && ValorTotal <= 30000.00) {
			ValorTotal = ValorTotal - (ValorTotal * 0.15);
			System.out.println("O valor total para a compra de ferraduras: R$" + df.format(ValorTotal));
		} else if (ValorTotal >= 30000.01 && ValorTotal <= 10000000.00) {
			ValorTotal = ValorTotal - (ValorTotal * 0.20);
			System.out.println("O valor total para a compra de ferraduras: R$" + df.format(ValorTotal));
		} else {
			System.out.println("O valor total para a compra de ferraduras: R$" + df.format(ValorTotal));
		}

	}
}
