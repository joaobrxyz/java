import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Interestelar");
        meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(220);

        meuFilme.exibeFichaTecnica();
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para marotonar Lost: " + lost.getDuracaoEmMinutos());
    }
}
