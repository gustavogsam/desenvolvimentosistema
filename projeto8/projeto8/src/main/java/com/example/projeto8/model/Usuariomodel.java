package com.example.projeto8.model;

import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//Gera o construtor com todos os atributos
@NoArgsConstructor//Gera o construtor vazio
@Data//Gera os getters e setters
@Entity//Cria a tabela no banco de dados
public class Usuariomodel {

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String email;

    

}
