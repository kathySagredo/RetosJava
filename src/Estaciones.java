import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {
        System.out.println("*** Estaciones del año ***");
        System.out.print("Número del mes: ");
        var n_mes = new Scanner(System.in).nextInt();

        var s_mes = switch (n_mes){
            case 12, 1,2 -> "Verano";
            case 3,4,5 -> "Otoño";
            case 6,7, 8 -> "Invierno";
            case 9,10,11 -> "Primavera";
            default -> "Estación desconocida";
        };

//
//        String s_mes;
//
//        if(n_mes == 1 || n_mes == 2 || n_mes == 12){
//            s_mes = "Verano";
//        } else if (n_mes >= 3 && n_mes <= 5) {
//            s_mes = "Otoño";
//        } else if (n_mes >=6 && n_mes <= 8) {
//            s_mes = "Invierno";
//        } else {
//            s_mes ="Primavera";
//        }

        System.out.println("Estación: " + s_mes);
    }
}
