package principal;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        p1.setNome("Gustavo");
        p1.cpf = "000.000.123";

        p2.setNome("Ana");
        p2.cpf = "122.000.123";

        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.cpf);

        System.out.println("NOme: " + p2.getNome());
        System.out.println("CPF: " + p2.cpf);
    }


}