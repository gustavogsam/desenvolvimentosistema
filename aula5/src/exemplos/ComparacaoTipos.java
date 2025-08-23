package exemplos;

public class ComparacaoTipos {
    public static void main(String[] args) {

        String nomeUsuario = "Marta";
        int senha = 123;

        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha==456);

        System.out.println("O nome do usario esta correto?"+ resultadoNome);
        System.out.print("A senha está correta?"+ resultadoSenha);
    }
}
