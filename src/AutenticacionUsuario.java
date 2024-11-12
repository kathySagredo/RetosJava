import java.util.Scanner;

public class AutenticacionUsuario {
    public static void main(String[] args) {
        final var USUARIO = "admin";
        final var PSSWD = "123";

        System.out.println("*** Sistema de autenticación ***");
        /*System.out.print("Cual es tu usuario? ");
        var usuario2 = new Scanner(System.in).nextLine();
        System.out.print("Cual es tu password? ");
        var psswd2 = Integer.parseInt(new Scanner(System.in).nextLine());

        var isCorrecto = usuario.equals(usuario2) && psswd == psswd2;

        System.out.println("Datos son correctos? " + isCorrecto);*/

        var booleano = true;
        while(booleano) {

            System.out.print("¿Cuál es tu usuario? ");
            var usuario2 = new Scanner(System.in).nextLine().strip();
            System.out.print("¿Cuál es tu password? ");
            var psswd2 = new Scanner(System.in).nextLine().strip();

            if (usuario2.equals(USUARIO) && psswd2.equals(PSSWD)) {
                System.out.println("Bienvenido al sistema");
                booleano = false;
            } else if (!(usuario2.equals(USUARIO) || psswd2.equals(PSSWD))) {
                System.out.println("Usuario y password invalidos, vuelve a intentarlo");
            } else if (!(usuario2.equals(USUARIO))) {
                System.out.println("Usuario incorrecto, vuelve a intentarlo");
            } else {
                System.out.println("Password incorrecta, vuelve a intentarlo");
            }
        }
    }
    }

