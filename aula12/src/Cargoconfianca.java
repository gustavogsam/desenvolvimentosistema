public abstract class Cargoconfianca extends Funcionario{
protected Bonificacao bonificacao;

    public Cargoconfianca(String nome, String cpf, String rg, Sexo sexo, double salariobase, String datanascimento, String dataadimissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salariobase, datanascimento, dataadimissao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
