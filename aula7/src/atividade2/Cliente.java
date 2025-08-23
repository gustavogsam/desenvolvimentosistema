package atividade2;

public class Cliente {
    private String nome;
    private int idade;
    private Pet animal;

    public Cliente(String nome, int idade, Pet animal) {
        this.nome = nome;
        this.idade = idade;
        this.animal = animal;

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

    public Pet getAnimal() {
        return animal;
    }

    public void setAnimal(Pet animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", animal=" + animal +
                '}';
    }
}
