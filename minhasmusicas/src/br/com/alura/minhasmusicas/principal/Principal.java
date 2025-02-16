package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.models.MinhasPreferidas;
import br.com.alura.minhasmusicas.models.Musica;
import br.com.alura.minhasmusicas.models.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Play hard");
        minhaMusica.setArtista("David Guetta");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Ucranianas x Russas");
        meuPodcast.setHost("Raiam Santos");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
