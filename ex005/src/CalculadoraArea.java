import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        int escolha = leitura.nextInt();

        while (escolha > 2 || escolha < 1) {
            System.out.println("Opção inválida!");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            escolha = leitura.nextInt();
        }

        if (escolha == 1) {
            System.out.print("Digite o valor de um lado do quadrado: ");
            double ladoQuadrado = leitura.nextDouble();
            double areaQuadrado = ladoQuadrado * ladoQuadrado;
            System.out.println("A área do quadrado é: " + areaQuadrado);
        }

        if (escolha == 2) {
            System.out.print("Digite o valor do raio: ");
            double raio = leitura.nextDouble();
            double areaCirculo = 3.14 * raio * raio;
            System.out.println("A área do círculo é: " + areaCirculo);
        }
    }
}
