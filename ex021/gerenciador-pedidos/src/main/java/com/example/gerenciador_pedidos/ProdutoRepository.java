package com.example.gerenciador_pedidos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findByNome(String nomeProduto);

    List<Produto> findByCategoria(Categoria categoria);

    List<Produto> findByPrecoGreaterThanEqual(double valor);

    List<Produto> findByPrecoLessThanEqual(double valor);

    List<Produto> findByNomeContainingIgnoreCase(String nomeProduto);

    List<Produto> findByCategoriaOrderByPrecoDesc(Categoria categoria);

    Long countByCategoria(Categoria categoria);

    Long countByPrecoGreaterThanEqual(double valor);
}
