package com.example.projeto6.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String datanas;
    @Column(nullable = false,unique = true)
    private String protocoloatendimento;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String datanas, String protocoloatendimento) {
        this.id = id;
        this.nome = nome;
        this.datanas = datanas;
        this.protocoloatendimento = protocoloatendimento;
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

    public String getDatanas() {
        return datanas;
    }

    public void setDatanas(String datanas) {
        this.datanas = datanas;
    }

    public String getProtocoloatendimento() {
        return protocoloatendimento;
    }

    public void setProtocoloatendimento(String protocoloatendimento) {
        this.protocoloatendimento = protocoloatendimento;
    }
}
