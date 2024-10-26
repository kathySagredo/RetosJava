import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final var VISTA_SIN_MAR = 150.5;
        final var VISTA_CON_MAR = 190.5;

        System.out.println("*** Sistema de reserva de hotel ***");
        System.out.print("Nombre del cliente: ");
        var nombreCliente = consola.nextLine();
        System.out.print("Dias de estadia: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());
        System.out.print("Cuarto con vista al mar (true or false): ");
        var isVista = Boolean.parseBoolean(consola.nextLine());

        var valor = isVista ? diasEstadia*VISTA_CON_MAR : diasEstadia*VISTA_SIN_MAR;

        System.out.printf("""
                ------ Detalles de la reservación ------
                Cliente: %s
                Días de estadía: %d
                Costo total: $%.2f
                Habitación con vista al mar: %b
                """, nombreCliente, diasEstadia, valor, isVista);








    }
}
