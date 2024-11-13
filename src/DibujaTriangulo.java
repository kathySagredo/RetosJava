import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {

        var salir = false;

        while(!salir){
            System.out.println("""
                    *** Dibuja un triangulo ***
                    1. Quiero dibujar
                    2. Salir
                    """);

            System.out.print("Elige una opción: ");
            var opcion = new Scanner(System.in).nextInt();

            switch (opcion){
                case 1 ->{
                    System.out.print("Inserte el número de filas: ");
                    var fila = new Scanner(System.in).nextInt();
                    var x = fila - 1;
                    for (int row = 0; row < fila; row++) {
                        var veces = 0;
                        for (int col = 0; col < fila ; col++) {
                            if (col == x - row) {
                                System.out.print("*");
                                while(veces < 2*row){
                                    System.out.print("*");
                                    veces++;
                                }
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                }
                case 2 -> {
                    System.out.println("Hasta luego!");
                    salir = true;
                }
                default -> System.out.println("Elige una opción correcta\n");
            }

        }
    }
}

