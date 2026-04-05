import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double distanciaKm, velocidadeKmh, tempoTotalHoras, parteDecimal;
        int totalHorasInt, anos, dias, horas, minutos;

        // entrada de dados
        System.out.print("Digite a distância até o destino (km): ");
        distanciaKm = sc.nextDouble();

        System.out.print("Digite a velocidade média da sonda (km/h): ");
        velocidadeKmh = sc.nextDouble();

        // processamento de dados
        tempoTotalHoras = distanciaKm / velocidadeKmh;
        totalHorasInt = (int) tempoTotalHoras;
        anos = totalHorasInt / 8760;
        dias = (totalHorasInt % 8760) / 24;
        horas = (totalHorasInt % 8760) % 24;
        parteDecimal = tempoTotalHoras - totalHorasInt;
        minutos = (int) (parteDecimal * 60);

        // saída de dados
        System.out.println(String.format("Tempo: %.2f h", tempoTotalHoras));
        System.out.println("Anos: " + anos);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
    }
}