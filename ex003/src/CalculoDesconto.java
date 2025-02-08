public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 60;
        double percentualDesconto = 15;
        double precoNovo = precoOriginal - precoOriginal * 15 / 100;
        System.out.println("O valor com desconto é: R$" + precoNovo);
    }
}