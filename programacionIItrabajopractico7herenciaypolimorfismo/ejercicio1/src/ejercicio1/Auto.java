package ejercicio1;


public class Auto extends Vehiculo {

    // Atributo adicional
    private int cantidadDePuertas;

    // Constructor llamando al constructor de la clase padre
    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    // Sobrescritura del método mostrarInfo
    @Override
    public void mostrarInfo() {
        System.out.println("Modelo: " + this.modelo + 
                           ", Marca: " + this.marca + 
                           ", Cantidad de puertas: " + cantidadDePuertas);
    }
}
