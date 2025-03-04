import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double limiteCartao;
        String descricao;
        double valor;
        int control = 1;
        List<Produto> listaProdutos = new ArrayList<>();

        System.out.print("Digite o limite do cartão: R$");
        limiteCartao = input.nextDouble();

        while (control == 1) {
            System.out.print("\nDigite a descrição da compra: ");
            descricao = input.next();

            System.out.print("Digite o valor da compra: R$");
            valor = input.nextDouble();

            if (valor > limiteCartao) {
                System.out.println("Saldo insuficiente!");
                break;
            } else {
                listaProdutos.add(new Produto(descricao, valor));
                limiteCartao -= valor;
            }

            System.out.println("Compra realizada!\n");

            System.out.println("Digite 0 para sair ou 1 para continuar");
            control = input.nextInt();
        }
        System.out.println("**************************");
        System.out.println("COMPRAS REALIZADAS: \n");
        Collections.sort(listaProdutos);
        for (Produto produto : listaProdutos) {
            System.out.println(produto.toString());
        }
        System.out.println("\n**************************");


    }
}