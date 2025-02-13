public class CarroPrincipal {
    public static void main(String[] args) {
        Carro lancer = new Carro();
        lancer.marca = "Mitsubishi";
        lancer.modelo = "Lancer gt";
        lancer.ano = 2013;
        lancer.cor = "Preto";

        lancer.exibirFicha();
        int idadeCarro = lancer.idadeCarro();
        System.out.println("O carro tem " + idadeCarro + " anos");
    }
}
