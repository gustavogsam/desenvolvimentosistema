package com.example.projeto5.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;

    public Cliente(UUID id, String nome, String telefone) {
        Id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
