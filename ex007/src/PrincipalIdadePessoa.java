public class PrincipalIdadePessoa {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Beatriz");
        pessoa1.setIdade(17);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("João");
        pessoa2.setIdade(19);

        System.out.println(pessoa1.getNome() + " é maior de idade? " + pessoa1.verificarIdade());
        System.out.println(pessoa2.getNome() + " é maior de idade? " + pessoa2.verificarIdade());
    }
}
