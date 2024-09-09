package com.example.mscatalogo.service;

import com.example.mscatalogo.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    public List<Producto> listar();

    public Producto guardar(Producto Producto);

    public Producto actualizar(Producto Producto);

    public Optional<Producto> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}