public class Engenheiro extends Funcionario{

    private String crea;

    public Engenheiro(String nome, String tel, Endereco endereco, String crea) {
        super(nome, tel, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "crea='" + crea + '\'' +
                ", nome='" + nome + '\'' +
                ", tel='" + tel + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
