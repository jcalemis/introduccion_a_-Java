package ejercicio2;



public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

