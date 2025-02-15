public class PrincipalProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 2000);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);

        System.out.println("Preço com desconto: " + produto.getPreco());
    }
}
