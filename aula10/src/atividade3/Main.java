package atividade3;

public class Main {
    public static void main(String[] args) {
        Motoboy m1 = new Motoboy("max","01/01/20",Sexo.Masculino,Setor.OPERACOES,2000,"5156451321" );
        Diretor d1 = new Diretor("will","10/05/1990",Sexo.Masculino,Setor.RECURSO_HUMANO,10000);

        d1.admitir(m1);

    }
}
