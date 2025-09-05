package atividade3;

public class Main {
    public static void main(String[] args) {
        Motoboy m1 = new Motoboy("Max","01/01/20",Sexo.Masculino,Setor.OPERACOES,2000,"5156451321" );
        Diretor d1 = new Diretor("will","10/05/1990",Sexo.Masculino,Setor.RECURSO_HUMANO,5000);

        System.out.println(m1.toString());

        System.out.println(d1.toString());

        d1.admitir(m1);

    }
}
