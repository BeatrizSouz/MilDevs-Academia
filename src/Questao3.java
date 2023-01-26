
/*Questão 03: Faça um algoritmo para ler três notas de um aluno em uma disciplina eimprimirasua média ponderada (as notas tem pesos respectivos de 1, 2 e 3). 
Calcule o valor das notascombase em seus pesos e além de apresentar a média, exiba a maior nota entre as 3notas, ou a 
mensagem “As 3 notas são iguais”, ou “As notas 1 e 2 são as maiores”, “As notas 1e3sãoasmaiores”, “As notas 2 e 3 são as maiores” caso exista duas notas iguais e elas sejamas maiores */
import java.util.Scanner;

public class Questao3 {
    public static void VerificarNotaMaior(float N1, float N2, float N3, float P1, float P2, float P3) {
        float NotaP1 = N1 * P1;
        float NotaP2 = N2 * P2;
        float NotaP3 = N3 * P3;

        if ((NotaP1 > NotaP2) && (NotaP1 > NotaP3)) {
            System.out.printf("A nota 1 (%.2f) e a maior de todas apos o cáculo do peso 1 (%.2f)", N1, NotaP1);

        } else if (NotaP2 > NotaP1 && NotaP2 > NotaP3) {
            System.out.printf("A nota 2 (%.2f) e a maior de todas apos o cáculo do peso 2 (%.2f)", N2, NotaP2);

        } else if (NotaP3 > NotaP1 && NotaP3 > NotaP2) {
            System.out.printf("A nota 3 (%.2f) e a maior de todas apos o cáculo do peso 3 (%.2f)", N3, NotaP3);

        } else if (NotaP1 == NotaP2 && NotaP1 == NotaP3) {
            System.out.println("As 3 notas são iguais");
        } else if (NotaP1 == NotaP2) {
            System.out.printf(
                    "A nota 1 (%.2f) e nota 2 (%.2f) e foram as  maiores notas apos o cáculo do peso 1 (%.2f) e peso 2 (%.2f)",
                    N1, N2, NotaP1, NotaP2);
        } else if (NotaP1 == NotaP3) {
            System.out.printf(
                    "A nota 1 (%.2f) e nota 3 (%.2f) e foram as  maiores notas apos o cáculo do peso 1 (%.2f) e peso 3 (%.2f)",
                    N1, N3, NotaP1, NotaP3);
        } else if (NotaP2 == NotaP3) {
            System.out.printf(
                    "A nota 2 (%.2f) e nota 3 (%.2f) e foram as  maiores notas apos o cáculo do peso 2 (%.2f) e peso 3 (%.2f)",
                    N2, N3, NotaP2, NotaP3);
        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float nota1, nota2, nota3;
        float media;

        System.out.print("Informe a primeira nota:");
        nota1 = teclado.nextFloat();

        System.out.print("Informe a segunda nota:");
        nota2 = teclado.nextFloat();

        System.out.print("Informe a terceira nota:");
        nota3 = teclado.nextFloat();

        media = (nota1 * 1 + nota2 * 2 + nota3 * 3) / 6;

        System.out.printf("A média ponderada das notas (%.2f), (%.2f),(%.2f) é %.2f \n", nota1, nota2, nota3, media);
        VerificarNotaMaior(nota1, nota2, nota3, 1, 2, 3);

    }
}
