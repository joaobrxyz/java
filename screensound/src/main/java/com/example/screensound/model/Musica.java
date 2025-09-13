package com.example.screensound.model;

import jakarta.persistence.*;

@Entity
@Table(name = "musicas")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String album;

    @ManyToOne
    private Artista artista;

    public Musica(){}

    public Musica(String nome, String album, Artista artista) {
        this.nome = nome;
        this.album = album;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Musica: '" + nome + '\'' +
                ", álbum: '" + album + '\'' +
                ", Artista: " + artista.getNome();
    }
}
