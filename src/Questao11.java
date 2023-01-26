// 10. Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre.
//a) a idade dessa pessoa em anos;
//b) a idade dessa pessoa em meses;
//c) a idade dessa pessoa em dias; considere todos os meses com 30 dias
//d) a idade dessa pessoa em semanas, considere que todos os messes possuem 4 semanas;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    int anoNasc, anoAtual, idadeAnos, mesesAnos;
	    
		System.out.print("Informe o ano de nascimento:");
		anoNasc = teclado.nextInt();
		
		System.out.print("Informe o ano atual:");
		anoAtual = teclado.nextInt();
		
		idadeAnos = (anoAtual - anoNasc);
		mesesAnos = (idadeAnos*12);
		
		
		System.out.println("A idade dessa pessoa em:");
		System.out.println("Anos é: "+ idadeAnos);
		System.out.println("Messes é: "+ mesesAnos);
		System.out.println("Semanas é: "+ mesesAnos*4);
		System.out.println("Dias é: "+ idadeAnos *360);
		
	}
}

