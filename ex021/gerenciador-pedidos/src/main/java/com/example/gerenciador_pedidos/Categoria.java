package com.example.gerenciador_pedidos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria {
    @Id
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public Categoria(){}

    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
