import java.util.Scanner;

public class AutenticacionUsuario {
    public static void main(String[] args) {
        final var usuario = "admin";
        final var psswd = 123;

        System.out.println("*** Sistema de autenticación ***");
        System.out.print("Cual es tu usuario? ");
        var usuario2 = new Scanner(System.in).nextLine();
        System.out.print("Cual es tu password? ");
        var psswd2 = Integer.parseInt(new Scanner(System.in).nextLine());

        var isCorrecto = usuario.equals(usuario2) && psswd == psswd2;

        System.out.println("Datos son correctos? " + isCorrecto);

    }
}
