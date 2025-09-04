package atividade3;

public abstract class Funcionario {
    protected String nome;
    protected String datanascimento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salariobase;

    public Funcionario(String nome, String datanascimento, Sexo sexo, Setor setor, double salariobase) {
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salariobase = salariobase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

   //public abstract double getsalariofinal();

}
