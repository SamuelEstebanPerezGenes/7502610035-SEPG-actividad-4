package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Juan Pérez", 20, 4.2);

        System.out.println("--- Datos iniciales ---");
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Edad: " + e.getEdad());
        System.out.println("Nota promedio: " + e.getNotaPromedio());

        System.out.println("\n--- Cambios válidos ---");
        e.setNombre("Juan Carlos Pérez");
        e.setEdad(21);
        e.setNotaPromedio(4.5);
        System.out.println(e.getNombre() + ", " + e.getEdad() + " años, nota " + e.getNotaPromedio());

        System.out.println("\n--- Cambios inválidos (se ignoran) ---");
        e.setNombre("   ");
        e.setEdad(-5);
        e.setNotaPromedio(7.0);
        System.out.println(e.getNombre() + ", " + e.getEdad() + " años, nota " + e.getNotaPromedio());
    }
}