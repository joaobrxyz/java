import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitura.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");
        }
    }
}