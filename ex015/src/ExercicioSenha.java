import java.util.Scanner;

public class ExercicioSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma senha: ");
        String senha = input.next();

        throw new SenhaInvalidaException("");
    }
    public static void validarSenha(String senha){
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter no mínimo 8 caracteres");
        }
    }
}
