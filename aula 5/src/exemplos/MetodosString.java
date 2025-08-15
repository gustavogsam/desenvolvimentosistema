package exemplos;

public class MetodosString {
    public static void main(String[] args) {

        String nome = "Gustavo";
        String sobrenome = "Sam";

        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: "+ nome.length() );

        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        // Exibindo nome Completo usando metodos Strings - Maiusculas
        System.out.println("Concatenação Maiuscula: "+ nomeCompleto.toUpperCase());

        // Exibindo nome completo usando metodos Strings = Minusculas
        System.out.println("Concatenação Minuscula: "+ nomeCompleto.toLowerCase());

    }
}