import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.print("Qual é o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.print("Avalie o filme de 0 a 10: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
