package atv1calcular;

public class Main {
    public static void main(String[] args) {
        Adicao a1 = new Adicao();
        Subtracao s1= new Subtracao();
        Multiplicao m1= new Multiplicao();
        Divisao d1= new Divisao();

        System.out.println(a1.calcular(2,3));
        System.out.println(s1.calcular(5,2));
        System.out.println(m1.calcular(5,2));
        System.out.println(d1.calcular(10,2));
    }
}
