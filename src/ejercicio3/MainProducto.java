package ejercicio3;

public class MainProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Cuaderno", 5000);
        System.out.println("Producto creado correctamente.");

        // --- Descomenta una por una para ver los errores de compilación ---
        // System.out.println(producto.precio);  // Error: 'precio' has private access in 'Producto'
        // producto.precio = 10000;              // Error: 'precio' has private access in 'Producto'
        // producto.getPrecio();                 // Error: el método getPrecio() no existe
    }
}