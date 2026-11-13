package ejercicio3;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // No hay getPrecio() ni setPrecio():
    // desde fuera de la clase es imposible leer o modificar el precio.
}