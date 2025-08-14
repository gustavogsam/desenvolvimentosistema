import java.util.ArrayList;
import java.util.Scanner;

public class lista1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;
        Double valor;

        do {
            int x=0;
            do{
            System.out.println("Digite uma nota");
            valor = ler.nextDouble();

            if(valor > 0 || valor <11) {
                notas.add(valor);
                x=1;
                        }
            else  {
                System.out.println("valor invalido");}
            }while(x<1);

            System.out.println("Deseja inserir mais uma nota?");
            System.out.println("\nPressione a tecla N para sair");
            resposta = ler.next();
        } while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas");
        for (double nota : notas) {
            System.out.println();
        }
    }
}
