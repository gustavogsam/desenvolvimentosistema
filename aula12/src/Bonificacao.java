public enum Bonificacao {
    Gerente(1.2),
    Diretor(1.4);

    public double valor;

    Bonificacao(double valor){
        this.valor=valor;
    }

    public double getValor(){
        return valor;
    }
}
