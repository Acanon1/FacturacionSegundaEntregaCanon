package com.example.FacturacionSegundaEntregaCanon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.FacturacionSegundaEntregaCanon.modelos.ReciboDetalles;
import com.example.FacturacionSegundaEntregaCanon.repositories.recibodetallesRepository;

@RestController
public class recibodetallesController {
    @Autowired
    recibodetallesRepository repo;

    @GetMapping("reciboDetalles")
    public List<ReciboDetalles> getReciboDetalles(){
        return repo.findAll();
    }

}
