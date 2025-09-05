package com.example.gerenciador_pedidos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
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

    @Query("SELECT p FROM Produto p WHERE :valor <= p.preco")
    List<Produto> produtosPrecoMaior(double valor);

    @Query("SELECT p FROM Produto p ORDER BY p.preco")
    List<Produto> orderByPreco();

    @Query("SELECT p FROM Produto p ORDER BY p.preco DESC")
    List<Produto> orderByPrecoDecrescente();

    @Query("SELECT p FROM Produto p WHERE p.nome ILIKE :letra%")
    List<Produto> startsWithLetter(String letra);

    @Query("SELECT AVG(p.preco) FROM Produto p")
    double mediaPrecos();

    @Query("SELECT MAX(p.preco) FROM Produto p WHERE p.categoria = :categoria")
    double precoMaximoPorCategoria(Categoria categoria);

    @Query("SELECT COUNT(p) FROM Produto p WHERE p.categoria = :categoria")
    int contarProdutosPorCategoria(Categoria categoria);
}
