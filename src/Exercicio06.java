import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        //declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double valorHora, aliquotaINSS;
        int horasMes;

        // entrada de dados
        System.out.print("Digite o valor da hora trabalhada: ");
        valorHora = sc.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasMes = sc.nextInt();

        System.out.print("Digite a alíquota do INSS (%): ");
        aliquotaINSS = sc.nextDouble();

        // processamento de dados
        double salarioBruto = valorHora * horasMes;
        double descontoINSS = salarioBruto * (aliquotaINSS / 100);
        double salarioLiquido = salarioBruto - descontoINSS;

        // saída de dados
        System.out.println(String.format("Salário bruto: R$ %.2f", salarioBruto));
        System.out.println(String.format("Desconto INSS: R$ %.2f", descontoINSS));
        System.out.println(String.format("Líquido: R$ %.2f", salarioLiquido));
    }
}