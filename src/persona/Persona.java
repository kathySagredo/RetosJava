package persona;

public class Persona {
    // Definir atributos
    private String nombre;
    private String apellido;

    // Constructor
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Encapsulamiento get y set de Nombre
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }


}
