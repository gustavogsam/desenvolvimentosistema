package com.example.projeto2.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "tab_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String Telefone;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        Telefone = telefone;
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

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", Telefone='" + Telefone + '\'' +
                '}';
    }
}


