import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double largura, altura, areaAbertura, espessura;
        double areaBruta, areaLiquida, volumeLaje;
        int aberturas, latas;

        // entrada de dados
        System.out.print("Digite a largura da parede (m): ");
        largura = sc.nextDouble();

        System.out.print("Digite a altura da parede (m): ");
        altura = sc.nextDouble();

        System.out.print("Digite a quantidade de aberturas: ");
        aberturas = sc.nextInt();

        System.out.print("Digite a área média de cada abertura (m²): ");
        areaAbertura = sc.nextDouble();

        System.out.print("Digite a espessura da laje (m): ");
        espessura = sc.nextDouble();

        // processamento de dados
        areaBruta = largura * altura;
        areaLiquida = areaBruta - (aberturas * areaAbertura);
        volumeLaje = areaBruta * espessura;
        latas = (int)(areaLiquida / 12);

        // saída de dados
        System.out.println(String.format("Área bruta: %.2f m²", areaBruta));
        System.out.println(String.format("Líquida: %.2f m²", areaLiquida));
        System.out.println(String.format("Volume laje: %.2f m³", volumeLaje));
        System.out.println("Latas: " + latas);
    }
}