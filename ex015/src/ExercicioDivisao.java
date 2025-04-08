import java.util.Scanner;

public class ExercicioDivisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int n1 = input.nextInt();

        System.out.print("Digite o divisor: ");
        int n2 = input.nextInt();

        try {
            int res = n1/n2;
            System.out.println("O resultado da divisão é: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir um número por 0");
        }

    }
}