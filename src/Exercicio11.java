import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double v0, a, t;
        double velocidadeFinal, distancia, parcelaAcelerada;

        // entrada de dados
        System.out.print("Digite a velocidade inicial (m/s): ");
        v0 = sc.nextDouble();

        System.out.print("Digite a aceleração (m/s²): ");
        a = sc.nextDouble();

        System.out.print("Digite o tempo (s): ");
        t = sc.nextDouble();

        // processamento de dados
        velocidadeFinal = v0 + a * t;
        distancia = v0 * t + (a * t * t) / 2;
        parcelaAcelerada = (a * t * t) / 2;

        // saída de dados
        System.out.println(String.format("Velocidade final: %.2f m/s", velocidadeFinal));
        System.out.println(String.format("Distância: %.2f m", distancia));
        System.out.println(String.format("Parcela acelerada: %.2f m", parcelaAcelerada));
    }
}