public class Diretor extends Cargoconfianca implements Contratacao {
    static double premio = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salariobase, String datanascimento, String dataadimissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salariobase, datanascimento, dataadimissao, bonificacao);
    }

    @Override
    public void adimitir(Funcionario funcionario) {
        System.out.println("Diretora:"+ this.nome + " admitiu funcionario  :" + funcionario.nome);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Diretora:"+ this.nome + " demitiu funcionario  :" + funcionario.nome);
    }

    @Override
    public double salario() {
        return this.salariobase * bonificacao.valor * premio;
    }

    @Override
    public String toString() {
        return "Diretor{" +
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
