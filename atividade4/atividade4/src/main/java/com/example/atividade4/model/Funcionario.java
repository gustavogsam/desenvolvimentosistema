package com.example.atividade4.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_fun")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;
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
    private Sexo sexo;
    @Column(nullable = false)
    private Setor setor;
    @Column(nullable = false)
    private double salario;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String telefone;
    @Column(nullable = false)
    private Endereco endereco;


    public Funcionario(long id, String nome, String cpf, String rg, String matricula, String datanascimento, Sexo sexo, Setor setor, double salario, String email, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.datanascimento = datanascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Funcionario() {
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salario=" + salario +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}

