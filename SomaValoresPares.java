public class SomaValoresPares {
    public static void main(String[] args) {
        int soma = 0;

        // Loop de 1 a 500 para encontrar e somar valores pares
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {  // Verifica se o número é par
                soma += i;      // Adiciona o valor par à soma
            }
        }

        System.out.println("A soma dos valores pares de 1 a 500 é: " + soma);
    }
}
