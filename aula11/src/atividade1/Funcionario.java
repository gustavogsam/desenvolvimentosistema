package atividade1;

public abstract class Funcionario implements Salariofinal {
    protected String nome;
    protected String cpf;
    protected String datanascimento;
    protected double salariobase;

    public Funcionario(String nome, String cpf, String datanascimento, double salariobase) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.salariobase = salariobase;
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

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", salariobase=" + salariobase +
                '}';
    }
}
