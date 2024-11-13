import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de calificaciones ***");
        System.out.print("¿Cuántas calificaciones desea agregar?: ");
        var numero = new Scanner(System.in).nextInt();
        var array = new float[numero];
        float num, sum;
        sum = 0;
        for (int i = 0; i < numero; i++) {
            System.out.printf("Calificación [%d]: ", i);
            num = new Scanner(System.in).nextFloat();
            array[i] = num;
            sum = sum + num;
        }
        var promedio = sum / numero;
        System.out.printf("Promedio = %.2f", promedio);
    }
}
