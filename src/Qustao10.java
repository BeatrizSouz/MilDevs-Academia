
//Faça um algoritmo que leia os dados necessários para calcular e exibir a área:
//Pesquisa na Internet como calcular a área de cada objeto abaixo:
//a) de um trapézio.
//b) de um quadrado.
//c) de um retangulo.
//d) de um círculo.
//e) de um triangulo.
import java.util.Scanner;

public class Qustao9 {

    public static void main(String[] args) {

        double areaCir, areaTra, areaQua, areaRet, areaTri;
        double maiorValor = 0;
        String objetoGeo = "";

        // area do trapézio
        areaTra = AreaTrapezio();
        if (areaTra >= maiorValor) {
            maiorValor = areaTra;
            objetoGeo = "Trapezio";

        }

        // area do quadrado
        areaQua = AreaQuadrado();
        if (areaQua >= maiorValor) {
            maiorValor = areaQua;
            objetoGeo = "Quadrado";

        }

        // area do retangulo.
        areaRet = AreaRetangulo();
        if (areaRet >= maiorValor) {
            maiorValor = areaRet;
            objetoGeo = "Retângulo";

        }

        // área do círculo.
        areaCir = AreaCirculo();
        if (areaCir >= maiorValor) {
            maiorValor = areaCir;
            objetoGeo = "Circulo";

        }

        // área de um triangulo.
        areaTri = AreaTriangulo();
        if (areaTri >= maiorValor) {
            maiorValor = areaTri;
            objetoGeo = "Triangulo";

        }

        System.out.printf("A área do trapézio é: %.2f\n", +areaTra);
        System.out.printf("A área do quadrado é: %.2f\n", +areaQua);
        System.out.printf("A área do retângulo é: %.2f\n", +areaRet);
        System.out.printf("A área do circulo é: %.2f\n", +areaCir);
        System.out.printf("A área do triangulo é: %.2f\n\n", +areaTri);
        System.out.printf("O objeto com maior área é %s com área de %.2f", objetoGeo, maiorValor);

    }

    private static double AreaTriangulo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A área do triangulo:");

        System.out.print("Informe o valor da base:");
        float base = teclado.nextFloat();

        System.out.print("Informe o valor da altura:");
        float h = teclado.nextFloat();

        double area = ((base * h) / 2);

        System.out.println();
        return area;
    }

    private static double AreaCirculo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A área do circulo:");

        System.out.print("Informe o valor do raio:");
        double r = teclado.nextDouble();
        double area = 3.14 * (r * r);

        System.out.println();
        return area;
    }

    private static double AreaRetangulo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A área do retângulo:");

        System.out.print("Informe o valor da base:");
        float base = teclado.nextFloat();

        System.out.print("Informe o valor da altura:");
        float h = teclado.nextFloat();

        double area = (base * h);

        System.out.println();
        return area;
    }

    private static double AreaQuadrado() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A área do quadrado:");
        System.out.print("Informe o valor dos lados:");
        float lado = teclado.nextFloat();

        double area = (lado * lado);

        System.out.println();
        return area;
    }

    private static double AreaTrapezio() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A área do trapézio :");
        System.out.print("informe o valor da base maior: ");
        float baseMaior = teclado.nextFloat();

        System.out.print("Informe o valor da base menor:");
        float baseMenor = teclado.nextFloat();

        System.out.print("Informe o valor da altura:");
        float h = teclado.nextFloat();

        double area = (baseMaior + baseMenor) * h;
        area = area / 2;
        System.out.println();
        return area;
    }

}
