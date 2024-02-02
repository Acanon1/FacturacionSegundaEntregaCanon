package com.example.FacturacionSegundaEntregaCanon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FacturacionSegundaEntregaCanon.modelos.Producto;
import com.example.FacturacionSegundaEntregaCanon.repositories.productoRepository;

@RestController
public class productoController {
    @Autowired
    productoRepository repo;

    @GetMapping("productos")
    public List<Producto> getProductos(){
        return repo.findAll();
    }
    
}