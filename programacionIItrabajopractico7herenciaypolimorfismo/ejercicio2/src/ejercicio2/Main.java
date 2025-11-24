package ejercicio2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Rectangulo(10, 4, "Rectangulo 1"));
        figuras.add(new Rectangulo(2, 6, "Rectangulo 2"));
        figuras.add(new Circulo(10, "Circulo 1"));
        figuras.add(new Circulo(3, "Circulo 2"));

        for (Figura f : figuras) {
            f.mostrarArea();
        }
    }
}
