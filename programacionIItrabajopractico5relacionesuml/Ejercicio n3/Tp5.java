
package tp5;

public class Tp5 {

    public static void main(String[] args) {
        System.out.println("Prueba de relaciones libro - uautor - editorial");

        // Crear objetos
        Autor autor = new Autor("DOXIADIS, Apóstolos", "Barcelona");
        Editorial editorial = new Editorial("Zeta Bolsillo", "Cen 1234, Barcelona");
        Libro libro = new Libro("El tío Petros y la conjetura de Goldbach", " 84-663-0392-8", autor, editorial);

        System.out.println("1. Objetos creados:");
        System.out.println("   Autor: " + autor);
        System.out.println("   Editorial: " + editorial);
        System.out.println("   Libro: " + libro);

        // Verificar relaciones
        System.out.println("\n2. Verificación de relaciones:");
        System.out.println("   Relación Libro → Autor: " + libro.getAutor().getNombre());
        System.out.println("   Relación Libro → Editorial: " + libro.getEditorial().getNombre());
        System.out.println("   Nacionalidad del autor: " + libro.getAutor().getNacionalidad());
        System.out.println("   Dirección de la editorial: " + libro.getEditorial().getDireccion());

        System.out.println("\n3. Estado final de los objetos:");
        System.out.println("   Libro: " + libro);
        System.out.println("   Autor: " + autor);
        System.out.println("   Editorial: " + editorial);

        // Prueba con múltiples instancias
        System.out.println("\n Segunda instancia");
        Autor autor2 = new Autor("Hans Aebli ", "Argentino");
        Editorial editorial2 = new Editorial("Kapelusz", "Buenos Aires");
        Libro libro2 = new Libro("Una didáctica fundada en la psicología de Jean Piaget ", "9501360172 ", autor2, editorial2);

        System.out.println("Segundo libro: " + libro2.getTitulo());
        System.out.println("Segundo autor: " + libro2.getAutor().getNombre());
        System.out.println("Segunda editorial: " + libro2.getEditorial().getNombre());
    }
}
