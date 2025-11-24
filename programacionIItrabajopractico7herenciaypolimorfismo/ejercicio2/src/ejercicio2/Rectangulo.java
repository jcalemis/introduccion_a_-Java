package ejercicio2;


public class Rectangulo extends Figura {

    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho, String nombre) {
        super(nombre);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return alto * ancho;
    }
}
