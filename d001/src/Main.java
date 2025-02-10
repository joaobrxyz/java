import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldo = 2500;
        int op = 0;

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\nNome: Neymar Júnior");
        System.out.println("Tipo conta: Corrente");
        System.out.println("Saldo inicial: R$" + saldo);
        System.out.println("************************************");

        while (op != 4) {
            System.out.println("Operações");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Sacar valor");
            System.out.println("4 - Sair");
            System.out.print("\nDigite a opção desejada: ");
            op = leitura.nextInt();

            switch (op) {
                case 1:
                    System.out.println("O saldo atual é R$" + saldo);
                    break;
                case 2:
                    System.out.print("Informe o valor a depositar: R$");
                    double valor_dp = leitura.nextDouble();
                    saldo += valor_dp;
                    System.out.println("Saldo atualizado: R$" + saldo);
                    break;
                case 3:
                    System.out.print("Informe o valor que deseja sacar: R$");
                    double valor_saque = leitura.nextDouble();
                    if (valor_saque > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldo -= valor_saque;
                        System.out.println("Saldo atualizado: R$" + saldo);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}