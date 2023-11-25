import java.util.Scanner;

public class SomaQuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = input.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = input.nextDouble();

        double soma = a + b + c;
        double resultado = Math.pow(soma, 2);

        System.out.println("O quadrado da soma dos valores é: " + resultado);

        input.close();
    }
}
