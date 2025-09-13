package com.example.projeto3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_cliente")
@AllArgsConstructor // substitui o construtor completo.
@NoArgsConstructor // substitui o construtor vazio.
@Data // substiui o get e set
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false,unique = true)
    private String tel;

    public Cliente() {
    }

    public Cliente(long id, String nome, String tel) {
        this.id = id;
        this.nome = nome;
        this.tel = tel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
