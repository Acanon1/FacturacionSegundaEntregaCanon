package com.example.FacturacionSegundaEntregaCanon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FacturacionSegundaEntregaCanon.modelos.Cliente;
import com.example.FacturacionSegundaEntregaCanon.repositories.clienteRepository;

@RestController
public class clienteController {
    @Autowired
    private clienteRepository repo;

    @GetMapping
    public String index(){
        return "conectado";
    }
    @GetMapping("clientes")
    public List<Cliente> getClientes(){
        return  repo.findAll();
    }
}

