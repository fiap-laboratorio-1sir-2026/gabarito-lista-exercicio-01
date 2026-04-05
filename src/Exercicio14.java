import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double capital, taxaMensal;
        double fator, montante, juros;

        // entrada de dados
        System.out.print("Digite o capital inicial (R$): ");
        capital = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        taxaMensal = sc.nextDouble();

        // processamento de dados
        fator = 1 + taxaMensal / 100;
        montante = capital * fator * fator * fator; // fator³ ou Math.pow(fator, 3)
        juros = montante - capital;

        // saída de dados
        System.out.println(String.format("Fator: %.6f", fator));
        System.out.println(String.format("Montante: R$ %.2f", montante));
        System.out.println(String.format("Juros: R$ %.2f", juros));
    }
}
