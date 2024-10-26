import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Número 1: ");
        var num1 = consola.nextInt();
        System.out.print("Número 2: ");
        var num2 = consola.nextInt();

        var mayor = num1 > num2 ? num1 : (num1 < num2) ? num2 : "Son iguales";

        System.out.println("Número mayor: " + mayor);

    }
}
