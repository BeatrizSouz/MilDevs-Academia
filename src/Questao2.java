
/*Questão 02: Faça um algoritmo que receba o valor do salário mínimo e o valor do saláriodeumfuncionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário. 
Caso o funcionário receba menos que 1 salário mínimo deverá ser apresentado a mensagem“Funcionário ganha menos que um salário mínimo”.*/
import java.util.Scanner;

public class Questao2 {
    public static double LerSalario(String mensagem) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensagem);
        return teclado.nextDouble();
    }

    public static void QtdSalarioMinimo(double SalarioFunc, double SalarioMini, double QtdSalario) {
        if (SalarioFunc < SalarioMini) {
            System.out.println("Funcionário ganha menos que um salário mínimo");
        } else {
            QtdSalario = SalarioFunc / SalarioMini;
            System.out.print("");
            System.out.printf("O funcionário recebe %.1f", QtdSalario);
            System.out.print(" salários mínimos!");
        }
    }

    public static void main(String[] args) {

        double SalarioFunc = 0;
        double SalarioMini = 0;
        double QtdSalario = 0;

        try {
            SalarioMini = LerSalario("Informe o valor do salário mínimo:");
            SalarioFunc = LerSalario("Informe o valor do salário do funcionário:");
            QtdSalarioMinimo(SalarioFunc, SalarioMini, QtdSalario);

        } catch (java.util.InputMismatchException erro) {
            System.out.print("Insira apenas números!!");
        }

    }
}
