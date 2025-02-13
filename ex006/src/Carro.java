public class Carro {
    String marca;
    String modelo;
    int ano;
    String cor;

    void exibirFicha(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public int idadeCarro(){
        return 2025 - ano;
    }
}
