package com.example.projeto2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Tab_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long produto;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private float preco;

    public Produto() {
    }

    public Produto(Long produto, String nome, float preco) {
        this.produto = produto;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getProduto() {
        return produto;
    }

    public void setProduto(Long produto) {
        this.produto = produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produto=" + produto +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
