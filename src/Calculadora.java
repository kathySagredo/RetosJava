import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);
        double num1, num2;
        while(!salir){
            System.out.println("""
                    *** Calculadora en Java ***
                    Operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
            System.out.print("Elige una opción: ");
            var opcion = consola.nextInt();
            switch (opcion){
                case 1 ->{
                    System.out.print("Inserte número 1: ");
                    num1 = consola.nextDouble();
                    System.out.print("Inserte número 2: ");
                    num2 = consola.nextDouble();
                    var suma = num1 + num2;
                    System.out.printf("Resultado suma: %.2f %n%n", suma );
                }
                case 2 -> {
                    System.out.print("Inserte número 1: ");
                    num1 = consola.nextDouble();
                    System.out.print("Inserte número 2: ");
                    num2 = consola.nextDouble();
                    var resta = num1 - num2;
                    System.out.printf("Resultado resta: %.2f %n%n", resta);
                }
                case 3 -> {
                    System.out.print("Inserte número 1: ");
                    num1 = consola.nextDouble();
                    System.out.print("Inserte número 2: ");
                    num2 = consola.nextDouble();
                    var multiplicacion = num1 * num2;
                    System.out.printf("Resultado multiplicación: %.2f %n%n", multiplicacion);
                }
                case 4 -> {
                    System.out.print("Inserte número 1: ");
                    num1 = consola.nextDouble();
                    System.out.print("Inserte número 2: ");
                    num2 = consola.nextDouble();
                    if(num2 == 0){
                        System.out.printf("Error: División por cero %n%n");
                    } else {
                        var division = num1 / num2;
                        System.out.printf("Resultado división: %.2f %n%n", division);
                    }
                }
                case 5 -> {
                    System.out.print("Saliendo del programa de calculadora...");
                    salir = true;
                }
                default -> System.out.printf("Opción invalida, inserte otra opción. %n%n");
            }
        }
    }
}
