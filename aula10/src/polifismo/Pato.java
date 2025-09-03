package polifismo;

public class Pato implements Animal {
    @Override
    public String emitirsom() {
        return "QUÊQUÊ";
    }

    @Override
    public String comer() {
        return " Inseto";
    }
}
