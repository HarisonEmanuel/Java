import java.util.Scanner;

public class CalculoMediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        System.out.println("Média: " + media);
        
        if (media <= 4.9) {
            System.out.println("REPROVADO");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("APROVADO");
        }
        
        scanner.close();
    }
}
