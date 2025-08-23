package atividade1;

public class Cliente {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Cliente(String nome, int idade, Endereco end) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEnd() {
        return endereco;
    }

    public void setEnd(Endereco end) {
        this.endereco = end;
    }

    @Override
    public String toString() {
        return "atividade1.Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", end=" + endereco +
                '}';
    }
}
