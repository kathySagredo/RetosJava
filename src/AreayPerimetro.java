import java.util.Scanner;

public class AreayPerimetro {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("*** Calcular area y perimetro ***");
        System.out.print("Cual es la altura (cm)? ");
        var altura = Integer.parseInt(consola.nextLine());
        System.out.print("Cual es la base (cm)? ");
        var base = Integer.parseInt(consola.nextLine());

        var perimetro = 2*altura + 2*base;
        var area = base*altura;

        System.out.printf("""
                ----------------
                Datos:
                Altura = %d cm,
                Base = %d cm,
                Perimetro = %d cm,
                Area = %d cm^2,
                """, altura, base, perimetro , area);

    }
}
