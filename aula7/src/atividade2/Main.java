package atividade2;

public class Main {
    public static void main(String[] args) {
        Pet p1 = new Pet("brutus", 2, "cachorro");
        Cliente c1 = new Cliente("ana", 18, p1);


        System.out.println(c1.toString());

    }
}
