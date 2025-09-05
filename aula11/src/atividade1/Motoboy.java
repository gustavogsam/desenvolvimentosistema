package atividade1;

public class Motoboy extends Funcionario {
    private String placadamoto;

    public Motoboy(String nome, String cpf, String datanascimento, double salariobase, String placadamoto) {
        super(nome, cpf, datanascimento, salariobase);
        this.placadamoto = placadamoto;
    }

    @Override
    public double obtersalariofinal() {
        return super.salariobase*1;
    }

    public String getPlacadamoto() {
        return placadamoto;
    }

    public void setPlacadamoto(String placadamoto) {
        this.placadamoto = placadamoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placadamoto='" + placadamoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", salariobase=" + salariobase +
                '}';
    }
}
