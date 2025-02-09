import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numAleatorio = new Random().nextInt(100);
        int numJogador = -1;
        Scanner leitura = new Scanner(System.in);
        int contador = 5;
        System.out.println("----------------------------");
        System.out.println("Jogo de adivinhação");
        System.out.println("----------------------------");

        while (numJogador != numAleatorio && contador >= 1) {
            System.out.println("Você tem " + contador + " tentativas.");
            System.out.print("Adivinhe o número entre 0 e 100: ");
            numJogador = leitura.nextInt();
            if (numJogador != numAleatorio) {
                contador--;
                if (numJogador > numAleatorio) {
                    System.out.println("O número é menor que " + numJogador);
                    System.out.println("----------------------------");
                } else {
                    System.out.println("O número é maior que " + numJogador);
                    System.out.println("----------------------------");
                }
            } else {
                System.out.println("Parabéns, você acertou o número!");
            }
        }
        if (numJogador != numAleatorio) {
            System.out.println("Infelizmente vc não acertou o número.");
            System.out.println("O número era: " + numAleatorio);
        }
    }
}