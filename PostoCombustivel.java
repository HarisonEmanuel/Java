import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e recebe o número de litros vendidos
        System.out.print("Informe o número de litros vendidos: ");
        double litros = scanner.nextDouble();

        // Solicita e recebe o tipo de combustível (A - Álcool, G - Gasolina)
        System.out.print("Informe o tipo de combustível (A - Álcool, G - Gasolina): ");
        char tipo = scanner.next().charAt(0);

        // Define os preços dos combustíveis e o valor a ser pago
        double precoAlcool = 4.90;
        double precoGasolina = 6.30;
        double valorAPagar = 0.0;

        // Calcula o valor a ser pago com base no tipo de combustível e quantidade de litros
        if (tipo == 'A' || tipo == 'a') {
            if (litros <= 20) {
                valorAPagar = litros * (precoAlcool - (precoAlcool * 0.03));
            } else {
                valorAPagar = litros * (precoAlcool - (precoAlcool * 0.05));
            }
        } else if (tipo == 'G' || tipo == 'g') {
            if (litros <= 20) {
                valorAPagar = litros * (precoGasolina - (precoGasolina * 0.04));
            } else {
                valorAPagar = litros * (precoGasolina - (precoGasolina * 0.06));
            }
        } else {
            // Exibe mensagem de tipo de combustível inválido e encerra o programa
            System.out.println("Tipo de combustível inválido. Use A para Álcool ou G para Gasolina.");
            System.exit(1);
        }

        // Exibe o valor a ser pago pelo cliente
        System.out.println("Valor a ser pago pelo cliente: R$" + valorAPagar);

        scanner.close();
    }
}
