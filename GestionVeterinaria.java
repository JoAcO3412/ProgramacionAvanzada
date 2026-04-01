//Nombre: Joaquín Devige.
//Legajo: 114638.


 import java.util.ArrayList;
 

public class GestionVeterinaria {
    public static void main(String[] args) {
        
        // Lista de mascotas (Polimorfismo).
        
        ArrayList<Mascota> inventario = new ArrayList<>();

        inventario.add(new Perro("Rocco", 5));
        inventario.add(new Gato("Luna", 3));
        inventario.add(new Perro("Indio", 2));

        System.out.println("--- Registro de Clínica Veterinaria ---");
        for (Mascota m : inventario) {
            m.mostrarInfo();
            System.out.println("Sonido: " + m.emitirSonido());
            System.out.println("-------------------------");
        }
    }
}

//Clase abstracta (Abstracción y Encapsulamiento).

abstract class Mascota {
    private String nombre;
    private int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto (Polimorfismo).
    
    public abstract String emitirSonido();

    // Getters y Setters.
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años");
    }
}

//Clases hijas de "Mascota" (Herencia).

class Perro extends Mascota {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String emitirSonido() {
        return "¡Guau! ¡Guau!";
    }
}

class Gato extends Mascota {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String emitirSonido() {
        return "¡Miau! ¡Miau!";
    }
}
