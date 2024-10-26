import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Tienda en línea con descuentos***");
        System.out.print("Monto de la compra: ");
        var montoCompra = Float.parseFloat(consola.nextLine());
        System.out.print("Es miembro (true or false): ");
        var isMiembro = Boolean.parseBoolean(consola.nextLine());

        int descuento;

        if(montoCompra > 1000 && isMiembro){
            descuento = 10;
        } else if (isMiembro) {
            descuento = 5;
        } else {
            descuento = 0;
        }
        var montoDescuento = montoCompra*descuento/100;
        var montoFinal = montoCompra - montoDescuento ;

        if(descuento>0){
            System.out.printf("""
                \nFelicidades, has obtenido un descuento del %d%%
                Monto de la compra: $%.2f
                Monto del descuento: $%.2f
                Monto final de la compra con descuento: $%.2f
                """,descuento,montoCompra,montoDescuento,montoFinal);
        } else {
            System.out.printf("""
                \nNo obtuviste ningun descuento
                Te invitamos hacerte miembro de la tienda
                Monto final de la compra: $%.2f
                """,montoFinal);
        }
    }
}
