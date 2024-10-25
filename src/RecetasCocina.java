import java.util.Scanner;

// Crear un programa para solicitar los valores más importante de una receta de cocina
public class RecetasCocina {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el nombre: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = consola.nextLine();
        System.out.print("Ingresa el tiempo de preparación (min): ");
        var tiempoPreparacion = consola.nextInt();
        consola.nextLine(); //Al combinar nextInt con nextline se requiere una linea adicional
        System.out.print("Ingresa la dificultad: ");
        var dificultad = consola.nextLine();

        System.out.printf("""
                \n--- Receta de cocina ---
                Nombre receta: %s
                Ingrediente: %s
                Tiempo de preparación: %d
                Dificultad: %s
                """,nombreReceta, ingredientes, tiempoPreparacion, dificultad);

    }
}
