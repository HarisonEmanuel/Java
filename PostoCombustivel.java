import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de litros vendidos: ");
        double litros = scanner.nextDouble();

        System.out.print("Informe o tipo de combustível (A - Álcool, G - Gasolina): ");
        char tipo = scanner.next().charAt(0);

        double precoAlcool = 4.90;
        double precoGasolina = 6.30;
        double valorAPagar = 0.0;

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
            System.out.println("Tipo de combustível inválido. Use A para Álcool ou G para Gasolina.");
            System.exit(1);
        }

        System.out.println("Valor a ser pago pelo cliente: R$" + valorAPagar);

        scanner.close();
    }
}
