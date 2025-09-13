package com.example.screensound.repository;

import com.example.screensound.model.Artista;
import com.example.screensound.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

    @Query("SELECT a FROM Artista a WHERE a.nome ILIKE :nomeArtista%")
    Artista encontrarPorNome(String nomeArtista);

    @Query("SELECT m FROM Artista a JOIN a.musicas m WHERE a.nome ILIKE :nomeArtista%")
    List<Musica> buscarMusicas(String nomeArtista);
}
