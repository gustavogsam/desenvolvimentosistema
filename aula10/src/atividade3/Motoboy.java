package atividade3;

public class Motoboy extends Funcionario {
    private String habilitacao;

    public Motoboy(String nome, String datanascimento, Sexo sexo, atividade3.Setor setor, double salariobase, String habilitacao) {
        super(nome, datanascimento, sexo, setor, salariobase);
        this.habilitacao = habilitacao;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "habilitacao='" + habilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", sexo=" + sexo +
                ", Setor=" + setor +
                ", salariobase=" + salariobase +
                '}';
    }
}
