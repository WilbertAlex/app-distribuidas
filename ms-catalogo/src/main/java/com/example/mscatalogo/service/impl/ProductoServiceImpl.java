package com.example.mscatalogo.service.impl;

import com.example.mscatalogo.entity.Producto;
import com.example.mscatalogo.entity.Producto;
import com.example.mscatalogo.repository.ProductoRepository;
import com.example.mscatalogo.service.ProductoService;
import com.example.mscatalogo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    @Override
    public Producto guardar(Producto Producto) {
        return productoRepository.save(Producto);
    }

    @Override
    public Producto actualizar(Producto Producto) {
        return productoRepository.save(Producto);
    }

    @Override
    public Optional<Producto> listarPorId(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        productoRepository.deleteById(id);
    }
}