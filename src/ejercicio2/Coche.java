package ejercicio2;

public class Coche {
    // 1. Todas las propiedades son privadas
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        // Se valida que la velocidad inicial no sea negativa
        if (velocidadMaxima >= 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            this.velocidadMaxima = 0;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // 2. Incrementa velocidadMaxima solo si el incremento es positivo
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        }
    }
}