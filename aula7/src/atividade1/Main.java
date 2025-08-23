package atividade1;

public class Main {
    public static void main(String[] args) {

        Endereco end1 = new Endereco("rua fim",10,"salvador");
        Cliente c1 = new Cliente("max",20,end1);

        System.out.println(c1.toString());
    }
}