package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 180);

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad máxima: " + coche.getVelocidadMaxima());

        coche.acelerar(20);
        System.out.println("Tras acelerar 20: " + coche.getVelocidadMaxima());

        coche.acelerar(-10); // se ignora: el incremento no es positivo
        System.out.println("Tras acelerar -10: " + coche.getVelocidadMaxima());

        // --- Intentos de acceso directo (descomenta uno para ver el error) ---
        // System.out.println(coche.marca);
        // coche.velocidadMaxima = 300;
    }
}