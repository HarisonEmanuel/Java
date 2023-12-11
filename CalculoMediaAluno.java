import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário inserir a primeira nota
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        // Solicita ao usuário inserir a segunda nota
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        // Calcula a média das notas
        double media = (nota1 + nota2) / 2;

        // Exibe a média calculada
        System.out.println("Média: " + media);

        // Determina o status do aluno com base na média
        if (media <= 4.9) {
            System.out.println("Status: REPROVADO");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Status: RECUPERAÇÃO");
        } else {
            System.out.println("Status: APROVADO");
        }

        scanner.close();
    }
}