package polifismo;

public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro();
        Gato g1 = new Gato();
        Pato p1 = new Pato();
        Galo ga1 = new Galo();

        System.out.println(c1.emitirsom()+c1.comer());
        System.out.println(g1.emitirsom()+g1.comer());
        System.out.println(p1.emitirsom()+p1.comer());
        System.out.println(ga1.emitirsom()+ga1.comer());
    }
}