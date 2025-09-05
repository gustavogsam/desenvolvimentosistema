public class Gerente extends Cargoconfianca {
    public Gerente(String nome, String cpf, String rg, Sexo sexo, double salariobase, String datanascimento, String dataadimissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salariobase, datanascimento, dataadimissao, bonificacao);
    }

    @Override
    public double salario() {
        return this.salariobase* bonificacao.valor;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salariobase=" + salariobase +
                ", salariofinal=" + this.salario() +
                ", datanascimento='" + datanascimento + '\'' +
                ", dataadimissao='" + dataadimissao + '\'' +
                '}';
    }
}
