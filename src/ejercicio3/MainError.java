package ejercicio3;

public class MainError {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        System.out.println("Persona creada correctamente.");

        // --- Descomenta la siguiente línea para ver el error de compilación ---
        // System.out.println(p.nombre); // Error: 'nombre' has private access in 'Persona'
    }
}