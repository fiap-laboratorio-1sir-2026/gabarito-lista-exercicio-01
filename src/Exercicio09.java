import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double custo, margem, desconto;
        double precoBase, valorDesconto, precoFinal, lucroReal;

        // entrada de dados
        System.out.print("Digite o custo do produto (R$): ");
        custo = sc.nextDouble();

        System.out.print("Digite a margem de lucro (%): ");
        margem = sc.nextDouble();

        System.out.print("Digite o desconto promocional (%): ");
        desconto = sc.nextDouble();

        // processamento de dados
        precoBase = custo * (1 + margem / 100);
        valorDesconto = precoBase * (desconto / 100);
        precoFinal = precoBase - valorDesconto;
        lucroReal = precoFinal - custo;

        // saída de dados
        System.out.println(String.format("Preço base: R$ %.2f", precoBase));
        System.out.println(String.format("Desconto: R$ %.2f", valorDesconto));
        System.out.println(String.format("Final: R$ %.2f", precoFinal));
        System.out.println(String.format("Lucro: R$ %.2f", lucroReal));
    }
}