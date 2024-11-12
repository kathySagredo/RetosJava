import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de envíos ***");

        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;
        var consola = new Scanner(System.in);
        System.out.print("Ingresa destino paquete (nacional o internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();
        System.out.print("Ingresa peso paquete en kg: ");
        var peso = Double.parseDouble(consola.nextLine());

        Double costo= switch (destino){
            case "nacional" -> peso*TARIFA_NACIONAL;
            case "internacional" -> peso*TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido");
                yield null;
            }
        };

        if(costo != null){
            System.out.printf("El costo de envío de paquiete es: $%.2f", costo);
        }

    }
}
