import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um cep para consultar: ");
        String cep = input.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Address newAddress = consultaCep.searchAddress(cep);
            System.out.println(newAddress);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(newAddress);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}