public class Motoboy extends Funcionario {
    private String placamoto;

    public Motoboy(String nome, String cpf, String rg, Sexo sexo, double salariobase, String datanascimento, String dataadimissao, String placamoto) {
        super(nome, cpf, rg, sexo, salariobase, datanascimento, dataadimissao);
        this.placamoto = placamoto;
    }

    public String getPlacamoto() {
        return placamoto;
    }

    public void setPlacamoto(String placamoto) {
        this.placamoto = placamoto;
    }

    @Override
    public double salario() {
        return super.salario();
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placamoto='" + placamoto + '\'' +
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
