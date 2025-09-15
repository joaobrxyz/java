package com.example.screenmatchfrases.repository;

import com.example.screenmatchfrases.model.SerieFrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SerieFraseRepository extends JpaRepository<SerieFrase, Long> {

    @Query(value = "SELECT * FROM serie_frase ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    public SerieFrase getFraseAleatoria();
}
