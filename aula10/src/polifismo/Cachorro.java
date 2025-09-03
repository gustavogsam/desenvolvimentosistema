package polifismo;

public class Cachorro implements Animal {

    @Override
    public String emitirsom() {
        return "AUAU";
    }

    @Override
    public String comer() {
        return " ração";
    }
}
