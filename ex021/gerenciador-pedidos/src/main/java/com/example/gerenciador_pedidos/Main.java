package com.example.gerenciador_pedidos;

import java.time.LocalDate;

public class Main {
    private Produto produto = new Produto("Celular", 3789.44);

    private Categoria categoria = new Categoria(12L, "Eletrônicos");

    private String dataString = "2025-08-24";
    private LocalDate dataFormatada = LocalDate.parse(dataString);
    private Pedido pedido = new Pedido(48956L, dataFormatada);

    public void salvarNoBanco(ProdutoRepository produtoRepository, CategoriaRepository categoriaRepository, PedidoRepository pedidoRepository){
        produtoRepository.save(produto);
        categoriaRepository.save(categoria);
        pedidoRepository.save(pedido);
    }
}
