package com.example.gerenciador_pedidos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByDataIsNotNull();

    List<Pedido> findByDataIsNull();
}
