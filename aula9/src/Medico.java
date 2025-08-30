public class Medico extends Funcionario{

    private String crm;

    public Medico(String nome, String tel, Endereco endereco, String crm) {
        super(nome, tel, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", nome='" + nome + '\'' +
                ", tel='" + tel + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
