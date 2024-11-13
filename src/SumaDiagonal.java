import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {
        System.out.println("*** Suma de diagonales ***");
        var consola = new Scanner(System.in);
        var array = new int[3][3];
        var suma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Ingresa un número[%d][%d]: ",i,j);
                array[i][j] = consola.nextInt();
                if(i==j){
                    suma = suma + array[i][j];
                }
            }
        }

        System.out.println("La suma de las diagonales es: " + suma);

    }
}
