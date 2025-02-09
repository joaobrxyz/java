import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int num = leitura.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
