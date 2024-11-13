package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        var persona1 = new Persona("Juan","Ross");
        System.out.println("Nombre Persona1: " + persona1.getNombre());
        System.out.println("Apellido Persona1: " + persona1.getApellido());

        persona1.setNombre("Raul");
        persona1.setApellido("Rodriguez");

        System.out.println("Nombre cambiado Persona1: " + persona1.getNombre());
        System.out.println("Apellido cambiado Persona1: " + persona1.getApellido());

    }

}
