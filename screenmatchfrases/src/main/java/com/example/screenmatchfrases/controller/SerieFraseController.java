package com.example.screenmatchfrases.controller;

import com.example.screenmatchfrases.dto.SerieFraseDTO;
import com.example.screenmatchfrases.model.SerieFrase;
import com.example.screenmatchfrases.service.SerieFraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series/frases")
public class SerieFraseController {
    @Autowired
    SerieFraseService service;

    @GetMapping
    public SerieFraseDTO getFrase(){
        return service.getFrase();
    }
}
