import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double pesoKg, valorMercadoria;
        int distanciaKm;

        // entrada de dados
        System.out.print("Digite o peso da encomenda (kg): ");
        pesoKg = sc.nextDouble();

        System.out.print("Digite o valor declarado da mercadoria (R$): ");
        valorMercadoria = sc.nextDouble();

        System.out.print("Digite a distância até o destino (km): ");
        distanciaKm = sc.nextInt();

        // processamento de dados
        double fretePeso = pesoKg * 3.20;
        double seguro = valorMercadoria * 0.02;
        double totalFrete = fretePeso + seguro;
        int prazo = distanciaKm / 500; // divisão inteira

        // saída de dados
        System.out.println(String.format("Frete: R$ %.2f", fretePeso));
        System.out.println(String.format("Seguro: R$ %.2f", seguro));
        System.out.println(String.format("Total: R$ %.2f", totalFrete));
        System.out.println("Prazo: " + prazo + " dia(s)");

    }
}