package com.example.FacturacionSegundaEntregaCanon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacturacionSegundaEntregaCanon.modelos.Producto;

public interface productoRepository extends JpaRepository<Producto, Long>{
    
}
