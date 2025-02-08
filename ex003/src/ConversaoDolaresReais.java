public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 100;
        double taxaDeConversao = 6;
        double valorEmReais = 100 * taxaDeConversao;
        System.out.println(valorEmDolares + " dólares são R$" + valorEmReais);
    }
}