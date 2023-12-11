import java.util.Scanner;

public class ConversorCelsiusParaFahrenheit {
    public static void main(String[] args) {

        // Cria um objeto `Scanner` para receber entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a temperatura em graus Celsius.
        System.out.print("Digite a temperatura em graus Celsius: ");

        // Lê o valor digitado pelo usuário como um número de ponto flutuante (`double`) e armazena na variável `celsius`.
        double celsius = scanner.nextDouble();

        // Fecha o objeto `Scanner` para liberar os recursos associados à entrada do usuário.
        scanner.close();

        // Calcula a temperatura em Fahrenheit usando a fórmula (9 * celsius + 160) / 5 e armazena o resultado em `fahrenheit`.
        double fahrenheit = (9 * celsius + 160) / 5;

        // Imprime a temperatura convertida em Fahrenheit.
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}