package com.example.screensound.main;

import com.example.screensound.model.Artista;
import com.example.screensound.model.Musica;
import com.example.screensound.model.TipoArtista;
import com.example.screensound.repository.ArtistaRepository;
import com.example.screensound.repository.MusicaRepository;

import java.util.List;
import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    private ArtistaRepository artistaRepository;
    private MusicaRepository musicaRepository;

    public Main(ArtistaRepository artistaRepository, MusicaRepository musicaRepository) {
        this.artistaRepository = artistaRepository;
        this.musicaRepository = musicaRepository;
    }
    public void runMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    *** Screen Sound Músicas ***
                    
                    1 - Cadastrar artistas
                    2 - Cadastrar músicas
                    3 - Listar músicas
                    4 - Buscar músicas por artistas
                    
                    0 - Sair                                 
                    """;

            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicasPorArtistas();
                    break;
            }
        }
    }

    private void cadastrarArtistas() {
        String opcao = "s";
        while (opcao.equalsIgnoreCase("s")) {
            System.out.println("Informe o nome desse artista: ");
            var nomeArtista = scanner.nextLine();
            System.out.println("Informe o tipo desse artista: (solo, dupla, banda)");
            var tipoArtistaStr = scanner.nextLine();
            TipoArtista tipoArtista = TipoArtista.valueOf(tipoArtistaStr.toUpperCase());
            Artista artista = new Artista(tipoArtista, nomeArtista);
            System.out.println(artista);
            artistaRepository.save(artista);
            System.out.println("Cadastrar outro artista? (S/N)");
            opcao = scanner.nextLine();
        }

    }

    private void cadastrarMusicas() {
        System.out.println("Artistas cadastrados: ");
        List<Artista> artistas = artistaRepository.findAll();
        artistas.forEach(artista ->
                System.out.println(artista.getNome()));
        System.out.println("Digite o nome do artista da música: ");
        var nomeArtista = scanner.nextLine();
        Artista artista = artistaRepository.encontrarPorNome(nomeArtista);
        System.out.println("Digite o nome da música: ");
        var nomeMusica = scanner.nextLine();
        System.out.println("Digite o nome do álbum: ");
        var nomeAlbum = scanner.nextLine();
        Musica musica = new Musica(nomeMusica, nomeAlbum, artista);
        musicaRepository.save(musica);
    }

    private void listarMusicas() {
        List<Musica> musicas = musicaRepository.findAll();
        musicas.forEach(System.out::println);
    }

    private void buscarMusicasPorArtistas() {
        System.out.println("Digite o nome do artista da música: ");
        var nomeArtista = scanner.nextLine();
        List<Musica> musicas = artistaRepository.buscarMusicas(nomeArtista);
        musicas.forEach(System.out::println);
    }

}
