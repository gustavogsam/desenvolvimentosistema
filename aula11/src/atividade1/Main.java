package atividade1;

public class Main {
    public static void main(String[] args) {

        Motoboy m1 = new Motoboy("marcus","4564123","01/01/01",2000,"h5456");
        Gerente g1 = new Gerente("jo","1231341","02/02/99",5000,Bonificacao.GERENTE);

        System.out.println(m1.toString());
        System.out.println(g1.toString());

        g1.admitir(m1);
    }
}