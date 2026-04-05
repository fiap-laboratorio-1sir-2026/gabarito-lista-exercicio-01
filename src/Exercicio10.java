import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double pesoKg, fatorAtividade;
        double kcalTotal, carbo, proteina, gordura, soma;

        // entrada de dados
        System.out.print("Digite o peso do paciente (kg): ");
        pesoKg = sc.nextDouble();

        System.out.print("Digite o fator de atividade: ");
        fatorAtividade = sc.nextDouble();

        // processamento de dados
        kcalTotal = pesoKg * fatorAtividade;
        carbo = kcalTotal * 0.50;
        proteina = kcalTotal * 0.30;
        gordura = kcalTotal * 0.20;
        soma = carbo + proteina + gordura;

        // saída de dados
        System.out.println(String.format("Total: %.0f kcal", kcalTotal));
        System.out.println(String.format("Carbo: %.0f", carbo));
        System.out.println(String.format("Proteína: %.0f", proteina));
        System.out.println(String.format("Gordura: %.0f", gordura));
        System.out.println(String.format("Soma: %.0f kcal", soma));
    }
}