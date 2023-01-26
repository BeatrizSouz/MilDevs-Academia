/*Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 5%. Após o
aumento, desconte 11% de INSS e 8% de FGTS e o % do IR conforme a tabela abaixo. 
Imprima o salário inicial, o salário com o aumento, o salário final, o desconto do INSS, 
o desconto do FGTS, o desconto do IR e o Total de Descontos (INSS+FGTS+IR). O desconto do 
Imposto de Renda é variável. Quando o salário do funcionário muda de uma faixa de 
desconto de IR para outra, ele pode mesmo com o aumento de 5% receber menos do que quando 
comparado antes do aumento. O seu algoritmo deve calcular e descobrir se o novo salário (5%) 
fará com que o usuário receba um salário final menor do que antes de aplicar os 5%.

base de calculo IR
Até 1.903,98                0%
De 1.903,99 até 2.826,65    7,5%
De 2.826,66 até 3.751,05    15%
De 3.751,06 até 4.664,68    22,5%
Acima de 4.664,68           27,5% 
PS: No mundo real o percentual é calculado apenas no excedente de cada faixa, 
mas não se preocupe com isto, faça o calculo simples multiplicando pela alíquota cheia.
*/

import java.util.Scanner;

public class Questao8 {

    public static float LerSalario(/* passagem de parametro */ ) {
        Scanner teclado;

        teclado = new Scanner(System.in);

        System.out.print("Digite o salário inicial: ");
        return teclado.nextFloat();

    }

    public static float Descontos(float salario, float desconto) {
        return salario * desconto;
    }

    public static float ImpostodeRenda(float salario) {
        float descontoIR = 0;

        if ((salario >= 1903.99) && (salario < 2826.65)) {
            descontoIR = salario * 0.075f;
        } else if ((salario >= 2826.66) && (salario < 3751.05)) {
            descontoIR = salario * 0.15f;
        } else if ((salario >= 3751.06) && (salario < 4664.68)) {
            descontoIR = salario * 0.225f;
        } else if (salario >= 4664.68) {
            descontoIR = salario * 0.275f;
        }

        return descontoIR;
    }

    public static float TotalDescontos(float IR, float FGTS, float INSS) {
        return IR + FGTS + INSS;
    }

    public static float SalariosFinais(float salario, float descontos) {
        return salario - descontos;
    }

    public static void EscrevaInformações(float SI, float A, float INSS, float FGTS, float IR, float totalDesc,
            float SF) {
        System.out.println();
        System.out.printf("Salário inicial: R$ %.2f\n", SI);
        System.out.printf("Salário reajustado: R$ %.2f\n\n", A);
        System.out.printf("Desconto INSS 11%%: R$ %.2f\n", INSS);
        System.out.printf("Desconto FGTS 8%%: R$ %.2f\n", FGTS);
        System.out.printf("Desconto IR: R$ %.2f\n\n", IR);
        System.out.printf("Total de descontos: R$ %.2f\n", totalDesc);
        System.out.printf("Salário final: R$ %.2f\n\n", SF);
    }

    public static void main(String[] args) {
        float salarioInicial, salarioPosAumento, salarioFinal;
        float descontoINSS, descontoIR = 0, descontoFGTS, totalDescontos;
        float salarioFinalAntesAumento;

        try {
            // calculo sem o aumento de 5%
            salarioInicial = LerSalario();
            descontoINSS = Descontos(salarioInicial, 0.11f);
            descontoFGTS = Descontos(salarioInicial, 0.08f);

            // calcular o desconto IR
            descontoIR = ImpostodeRenda(salarioInicial);

            totalDescontos = TotalDescontos(descontoIR, descontoFGTS, descontoINSS);
            salarioFinal = SalariosFinais(salarioInicial, totalDescontos);

            salarioFinalAntesAumento = salarioFinal;

            // calculos considerando o aumento de 5%
            salarioPosAumento = Descontos(salarioInicial, 1.05f);
            descontoINSS = Descontos(salarioPosAumento, 0.11f);
            descontoFGTS = Descontos(salarioPosAumento, 0.08f);

            // calculo do Imposto de Renda
            descontoIR = ImpostodeRenda(salarioPosAumento);

            totalDescontos = TotalDescontos(descontoIR, descontoFGTS, descontoINSS);
            salarioFinal = SalariosFinais(salarioPosAumento, totalDescontos);

            EscrevaInformações(salarioInicial, salarioPosAumento, descontoINSS, descontoFGTS, descontoIR,
                    totalDescontos, salarioFinal);

            if (salarioFinal < salarioFinalAntesAumento) {
                System.out.printf("O novo salário final é menor que o salário recebido antes do aumento!");
            }

        } catch (java.util.InputMismatchException erro) {
            System.out.println("informe apenas números!");
        }

    }
}
