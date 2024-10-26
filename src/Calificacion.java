import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de calificación ***");
        System.out.print("Ingrese nota: ");
        var nota = Float.parseFloat(new Scanner(System.in).nextLine());
        String letra;
        if(nota >=9 && nota <= 10){
            letra = "A";
        } else if (nota >= 8 && nota < 9) {
            letra = "B";
        } else if (nota >=7 && nota <8) {
            letra = "C";
        } else if (nota >=6 && nota < 7) {
            letra = "D";
        } else if (nota >= 0 && nota < 6) {
            letra = "F";
        } else {
            letra = "Valor desconocido";
        }

        System.out.println("Calificación = " + letra);

    }
}
