package ejercicio2;


public abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("El área del " + nombre + " es: " + calcularArea());
    }
}
