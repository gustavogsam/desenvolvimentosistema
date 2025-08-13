import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Double> notas= new ArrayList<>();

        notas.add(10.0);
        notas.add(8.0);

        for(double nota:notas){
            System.out.println("Notas:"+nota);
        }
    }
}