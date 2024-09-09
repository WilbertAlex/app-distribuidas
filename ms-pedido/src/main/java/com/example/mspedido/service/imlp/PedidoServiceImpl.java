package com.example.mspedido.service.imlp;

import com.example.mspedido.entity.Pedido;
import com.example.mspedido.repository.PedidoRepository;
import com.example.mspedido.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

public class PedidoServiceImpl implements PedidoService  {
    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public List<Pedido> list() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido save(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Optional<Pedido> findById(Integer id) {
        return pedidoRepository.findById(id);
    }
    @Override
    public void delete(Integer id) {
       pedidoRepository.findById(id);
    }
    @Override
    public Pedido update(Pedido pedido) {
        return null;
    }
}
