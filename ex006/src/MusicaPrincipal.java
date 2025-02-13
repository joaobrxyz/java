public class MusicaPrincipal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Play Hard";
        minhaMusica.artista = "David Guetta";
        minhaMusica.anoLancamento = 2013;

        minhaMusica.exibirFicha();

        minhaMusica.avaliar(4.9);
        minhaMusica.avaliar(5);
        minhaMusica.avaliar(4.3);
        minhaMusica.avaliar(4.7);

        double mediaAvaliacoes = minhaMusica.mediaDeAvaliacoes();

        System.out.println("A média das avaliações é: " + mediaAvaliacoes);
    }
}
