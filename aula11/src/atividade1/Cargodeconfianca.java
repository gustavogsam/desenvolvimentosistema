package atividade1;

public abstract class Cargodeconfianca extends Funcionario  {
    protected Bonificacao bonificacao;


    public Cargodeconfianca(String nome, String cpf, String datanascimento, double salariobase, Bonificacao bonificacao) {
        super(nome, cpf, datanascimento, salariobase);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "Cargodeconfianca{" +
                "bonificacao=" + bonificacao +
                '}';
    }
}
