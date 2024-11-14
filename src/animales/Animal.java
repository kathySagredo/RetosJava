package animales;

public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al día");
    }
    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }

    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    // Public, protected, default y private (más restrictivo) para metodos
    protected void hacerSonido(){
        System.out.println("Puedo ladrar");
    }
    protected void dormir(){
        // Sobreescribe el metodo
        System.out.println("Duermo 15 horas al día");
        // Para acceder al metodo sobreescrito
        System.out.println("Dormir clase Padre: ");
        super.dormir();
    }

}

class Gato extends Animal{
    protected void hacerSonido(){
        System.out.println("Puedo maullar");
    }
}

class PruebaAnimal{
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de herencia ***");
        System.out.println("Clase Padre, soy un animal");
        var animal1 = new Animal(); // apunta un objeto
        animal1.comer();
        animal1.dormir();
        // animal1.hacersonido(); no exite
        System.out.println("\nClase hija, soy un perro");
        var perro1 = new Perro();
        perro1.dormir(); // Se accede a metodo porque se extiende a Padre
        perro1.comer();
        perro1.hacerSonido();
        // Polimorfismo
        System.out.println("\n*** Polimorfismo ***");
        var animal2 = new Perro(); // Se puede trabajar con clases hija o padre
        imprimirSonido(animal2);




    }
}
