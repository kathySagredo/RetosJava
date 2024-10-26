import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {
        System.out.println("*** Estaciones del año ***");
        System.out.print("Número del mes: ");
        var n_mes = new Scanner(System.in).nextInt();
        String s_mes;

        if(n_mes == 1 || n_mes == 2 || n_mes == 12){
            s_mes = "Verano";
        } else if (n_mes >= 3 && n_mes <= 5) {
            s_mes = "Otoño";
        } else if (n_mes >=6 && n_mes <= 8) {
            s_mes = "Invierno";
        } else {
            s_mes ="Primavera";
        }

        System.out.println("Estación: " + s_mes);
    }
}
