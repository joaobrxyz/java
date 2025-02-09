import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitura.nextInt();
        if (num >= 0) {
            System.out.println("O número " + num + " é positivo.");
        } else {
            System.out.println("O número " + num + " é negativo.");
        }
    }
}