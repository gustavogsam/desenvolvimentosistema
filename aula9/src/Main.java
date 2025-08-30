//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Endereco end1 = new Endereco("rua paz",1,"terreo","000.0000","salvador");
        Endereco end2 = new Endereco("rua amor",56,"predio","111.1111","barreira");

        Engenheiro e1 = new Engenheiro("kas","2456456465",end1,"241654561");

        Medico m1 = new Medico("polo","524564561",end2,"45641231321");

        System.out.println(e1.toString());
        System.out.println(m1.toString());
    }
}