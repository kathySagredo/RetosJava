import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        var salir = false;
        var saldo = 1000.00;

        while(!salir) {
            System.out.println("""
                    \n*** Aplicación de Cajero automatico ***
                    Operaciones que puedes consultar:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    """);
            System.out.print("Escoge una opción: ");
            var opcion = new Scanner(System.in).nextInt();
            switch(opcion){
                case 1 -> System.out.printf("Tu saldo actual es: $%.2f \n", saldo);
                case 2 -> {
                    System.out.print("Ingrese el monto a retirar: ");
                    var retiro = new Scanner(System.in).nextFloat();
                    if((saldo - retiro) < 0){
                        System.out.printf("No cuentas con el saldo suficiente. Saldo actual es: $%.2f \n", saldo);
                    } else {
                        saldo = saldo - retiro;
                        System.out.printf("Tu nuevo saldo es: $%.2f \n", saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese el monto a depositar: ");
                    var deposito = new Scanner(System.in).nextFloat();
                    saldo = saldo + deposito;
                    System.out.printf("Tu nuevo saldo es: $%.2f \n", saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero automatico... Hasta pronto!");
                    salir = true;
                }
                default -> System.out.print("Opción invalida, seleccione otra opción. \n");
            }
        }
        }

    }

