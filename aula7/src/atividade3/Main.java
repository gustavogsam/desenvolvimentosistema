package atividade3;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(11,"jao",1500.2,Setor.Marketing,Sexo.Masculino,25);
        Funcionario f2 = new Funcionario(1,"mara",1200.50,Setor.Marketing,Sexo.Feminino,30);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }

}
