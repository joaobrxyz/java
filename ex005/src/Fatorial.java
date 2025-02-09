import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitura.nextInt();
        int fat = num - 1;
        int res = num;

        while (fat != 1) {
            res *= fat;
            fat--;
        }
        System.out.println("O fatorial de " + num + " é: " + res);
    }
}
