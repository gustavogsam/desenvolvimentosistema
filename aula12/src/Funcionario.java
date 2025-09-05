public class Funcionario implements Salariofinal {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Sexo sexo;
    protected double salariobase;
    protected String datanascimento;
    protected String dataadimissao;

    public Funcionario(String nome, String cpf, String rg, Sexo sexo, double salariobase, String datanascimento, String dataadimissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.salariobase = salariobase;
        this.datanascimento = datanascimento;
        this.dataadimissao = dataadimissao;
    }

    @Override
    public double salario() {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getDataadimissao() {
        return dataadimissao;
    }

    public void setDataadimissao(String dataadimissao) {
        this.dataadimissao = dataadimissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salariobase=" + salariobase +
                ", datanascimento='" + datanascimento + '\'' +
                ", dataadimissao='" + dataadimissao + '\'' +
                '}';
    }
}
