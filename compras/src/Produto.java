public class Produto implements Comparable<Produto> {
    private String descricao;
    private double valor;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.getDescricao() + " - R$" + this.getValor();
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.valueOf(this.getValor()).compareTo(Double.valueOf(outroProduto.getValor()));
    }
}
