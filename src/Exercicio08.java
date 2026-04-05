import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double capital, taxaMensal, aliquotaIR;
        double rendimentoBruto, imposto, rendimentoLiquido, saldoTotal;

        // entrada de dados
        System.out.print("Digite o capital aplicado (R$): ");
        capital = sc.nextDouble();

        System.out.print("Digite a taxa mensal (%): ");
        taxaMensal = sc.nextDouble();

        System.out.print("Digite a alíquota do IR (%): ");
        aliquotaIR = sc.nextDouble();

        // processamento de dados
        rendimentoBruto = capital * (taxaMensal / 100);
        imposto = rendimentoBruto * (aliquotaIR / 100);
        rendimentoLiquido = rendimentoBruto - imposto;
        saldoTotal = capital + rendimentoLiquido;

        // saída de dados
        System.out.println(String.format("Rend. bruto: R$ %.2f", rendimentoBruto));
        System.out.println(String.format("Imposto: R$ %.2f", imposto));
        System.out.println(String.format("Líquido: R$ %.2f", rendimentoLiquido));
        System.out.println(String.format("Saldo: R$ %.2f", saldoTotal));
    }
}