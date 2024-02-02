package com.example.FacturacionSegundaEntregaCanon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacturacionSegundaEntregaCanon.modelos.Cliente;

public interface clienteRepository extends JpaRepository<Cliente, Long>{
    
}
