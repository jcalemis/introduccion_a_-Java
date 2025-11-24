package ejercicio1;


public class Vehiculo {

    // Declaramos los atributos de la clase padre protegidos
    protected String marca;
    protected String modelo;

    // Creamos su constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para mostrar la información de un Vehiculo
    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo + ", Marca: " + marca);
    }
}
