package atividade1;

public class Gerente extends Cargodeconfianca implements Contratacao{

    public Gerente(String nome, String cpf, String datanascimento, double salariobase, Bonificacao bonificacao) {
        super(nome, cpf, datanascimento, salariobase, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("admitir funcionario :" + funcionario.nome);
    }

    @Override
    public void demiitir(Funcionario funcionario) {
        System.out.println("demitir funcionario :" + funcionario.nome);

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", salariobase=" + salariobase +
                ", salariofinal=" + obtersalariofinal() +
                '}';
    }

    @Override
    public double obtersalariofinal() {

        return super.salariobase * super.bonificacao.valor;
    }
}
