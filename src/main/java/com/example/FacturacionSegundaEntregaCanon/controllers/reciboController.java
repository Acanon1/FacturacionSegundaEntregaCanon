package com.example.FacturacionSegundaEntregaCanon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FacturacionSegundaEntregaCanon.modelos.Recibo;
import com.example.FacturacionSegundaEntregaCanon.repositories.reciboRepository;



@RestController
public class reciboController {
    @Autowired
    reciboRepository repo;

    @GetMapping("recibos")
    public List<Recibo> getRecibos(){
        return repo.findAll();
    }
}
