public abstract class Funcionario {
    protected String nome;
    protected String tel;
    protected Endereco endereco;

    public Funcionario(String nome, String tel, Endereco endereco) {
        this.nome = nome;
        this.tel = tel;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
