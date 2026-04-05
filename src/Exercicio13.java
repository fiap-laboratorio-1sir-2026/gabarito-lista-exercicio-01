import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double franquiaGB, consumoMB, valorPlano, precoPorMB;
        double franquiaMB, excedente, custoExcedente, total;

        // entrada de dados
        System.out.print("Digite a franquia contratada (GB): ");
        franquiaGB = sc.nextDouble();

        System.out.print("Digite o consumo do mês (MB): ");
        consumoMB = sc.nextDouble();

        System.out.print("Digite o valor mensal do plano (R$): ");
        valorPlano = sc.nextDouble();

        System.out.print("Digite o preço por MB excedente (R$): ");
        precoPorMB = sc.nextDouble();

        // processamento de dados
        franquiaMB = franquiaGB * 1024;
        excedente = consumoMB - franquiaMB;
        custoExcedente = excedente * precoPorMB;
        total = valorPlano + custoExcedente;

        // saída de dados
        System.out.println(String.format("Franquia: %.2f MB", franquiaMB));
        System.out.println(String.format("Excedente: %.2f MB", excedente));
        System.out.println(String.format("Custo: R$ %.2f", custoExcedente));
        System.out.println(String.format("Total: R$ %.2f", total));
    }
}