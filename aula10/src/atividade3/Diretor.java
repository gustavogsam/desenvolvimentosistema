package atividade3;

public class Diretor extends Funcionario implements Contratacao {

    private static double premio =0.2;

    public Diretor(String nome, String datanascimento, Sexo sexo, Setor setor, double salariobase) {
        super(nome, datanascimento, sexo, setor, salariobase);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println(" Admitir funcionario "+ funcionario.nome);

    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println(" demitir funcionario" + funcionario.nome);

    }

    @Override
    public double getsalariofinal() {
        return (this.premio * super.salariobase)+super.salariobase;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salariobase=" + salariobase +
                ", salariofinal=" + getsalariofinal() +
                '}';

    }

}
