package com.example.mspedido.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PedidoDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double precio;
    private Double cantidad;
    private String Producto;

    public PedidoDetalle() {
        this.cantidad = (double) 0;
        this.precio = (double) 0;
    }
}
