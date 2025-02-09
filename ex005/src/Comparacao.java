import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n1 = leitura.nextInt();
        System.out.print("Digite um número inteiro: ");
        int n2 = leitura.nextInt();
        if (n1 > n2) {
            System.out.println("O número " + n1 + " é maior.");
        } else if (n2 > n1) {
            System.out.println("O número " + n2 + " é maior.");
        } else {
            System.out.println("Os dois números são iguais.");
        }
    }
}
