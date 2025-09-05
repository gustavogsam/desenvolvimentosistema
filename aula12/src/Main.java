public class Main {
    public static void main(String[] args) {

        Motoboy m1= new Motoboy("paulo","23145645","4564564",Sexo.Masculino,2000,"01/01/2001","10/09/2020","ahj152");
        Gerente g1 = new Gerente("willian","564654","1354564",Sexo.Masculino,5000,"10/10/95","05/11/15",Bonificacao.Gerente);
        Diretor d1 = new Diretor("Ana","141513221","45645645",Sexo.Feminino,10000,"20/01/90","02/06/07",Bonificacao.Diretor);

        System.out.println(m1.toString());
        System.out.println(g1.toString());
        System.out.println(d1.toString());

        d1.adimitir(g1);
        d1.demitir(m1);


    }
}