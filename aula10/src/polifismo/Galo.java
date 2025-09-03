package polifismo;

public class Galo implements Animal {
    @Override
    public String emitirsom() {
        return "COCO";
    }

    @Override
    public String comer() {
        return " milho";
    }
}
