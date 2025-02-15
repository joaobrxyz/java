public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 8, 7, 4);
        System.out.println("O aluno " + aluno.getNome() + " teve a média de: " + aluno.getMedia());
    }
}
