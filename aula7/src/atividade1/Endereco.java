package atividade1;

public class Endereco {
    private String logadouro;
    private int numero;
    private String cidade;

    public Endereco(String logadouro, int numero, String cidade) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "atividade1.Endereco{" +
                "logadouro='" + logadouro + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
