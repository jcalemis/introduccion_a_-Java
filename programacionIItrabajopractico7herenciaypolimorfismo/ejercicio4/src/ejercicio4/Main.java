package ejercicio4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());

        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
