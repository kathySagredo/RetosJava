import java.util.Random;
import java.util.Scanner;

public class GeneradorID {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de ID único ***");
        var consola = new Scanner(System.in);
        var random = new Random();
        System.out.print("Cual es tu nombre? ");
        var nombre = consola.nextLine();
        System.out.print("Cual es tu apellido? ");
        var apellido = consola.nextLine();
        System.out.print("Cual es tu año de nacimiento (YYYY)? ");
        var anioNacimiento = consola.nextLine();
        
        var subcadenaNombre = nombre.substring(0,2).toUpperCase();
        var subcadenaApellido = apellido.substring(0,2).toUpperCase();
        var subcadenaAnio = anioNacimiento.substring(2);

        var numero = random.nextInt(9999)+1;
        var numeroAleatorio = String.format("%04d", numero);

        var IdUnico = subcadenaNombre + subcadenaApellido + subcadenaAnio + numeroAleatorio;
        System.out.printf("""
                %nHola %s,
                Tu número de identificación (ID) generador por el sistema es:
                %s
                Felicidades
                """, nombre, IdUnico);


    }
}
