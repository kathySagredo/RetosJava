import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        System.out.println("""
                *** BIENVENIDO AL JUEGO NÚMERO SECRETO ***
                Tendras que adivinar el número que estoy pensando, cuidado solo tienes 10 intentos.
                Te daré pistas para ver si estas cerca del número, suerte y que comience el juego.
                """);
        var num = new Random().nextInt(50);
        var consola = new Scanner(System.in);
        var intentos = 0;
        while(intentos < 10){
            System.out.print("Ingresa un número:");
            var numero = consola.nextInt();
            if(numero == num){
                System.out.println("ADIVINASTE, FELICITACIONES!!!");
                break;
            } else if (numero > num) {
                System.out.println("Cuidado el número es menor");
            } else {
                System.out.println("Cuidado el número es mayor");
            }
            intentos++;
            var quedan = 10 - intentos;
            if(quedan == 0){
                System.out.printf("Te quedan %d intentos, perdiste :c %n", quedan);
            } else {
                System.out.printf("Te quedan %d intentos %n", quedan);
            }

        }

    }
}
