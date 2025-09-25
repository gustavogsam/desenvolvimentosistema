package com.example.projeto6.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false,unique = true)
    private String cpf;
    @Column(nullable = false,unique = true)
    private String rg;
    @Column(nullable = false,unique = true)
    private String matricula;
    @Column(nullable = false)
    private String datanascimento;
    @Column(nullable = false)
    private double salario;
    @Column(nullable = false, unique = true)
    private String telefone;
    @Column(nullable = false,unique = true)
    private String email;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String cpf, String rg, String matricula, String datanascimento, double salario, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.datanascimento = datanascimento;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", matricula='" + matricula + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", salario=" + salario +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
