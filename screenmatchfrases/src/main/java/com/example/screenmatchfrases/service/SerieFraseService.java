package com.example.screenmatchfrases.service;

import com.example.screenmatchfrases.dto.SerieFraseDTO;
import com.example.screenmatchfrases.model.SerieFrase;
import com.example.screenmatchfrases.repository.SerieFraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieFraseService {
    @Autowired
    SerieFraseRepository repository;

    public SerieFraseDTO getFrase() {
        SerieFrase serieFrase = repository.getFraseAleatoria();
        return new SerieFraseDTO(serieFrase.getTitulo(), serieFrase.getFrase(), serieFrase.getPersonagem(), serieFrase.getPoster());
    }
}
