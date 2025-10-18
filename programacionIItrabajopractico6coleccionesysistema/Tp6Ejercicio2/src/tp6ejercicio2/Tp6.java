
package tp6;


import java.util.List;
public class Tp6 {

    
    public static void main(String[] args) {
        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A2", "Julio Cortázar", "Argentina");
        Autor autor3 = new Autor("A3", "Isabel Allende", "Chilena");

        // 3. Agregar libros
        biblioteca.agregarLibro("ISBN-001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN-002", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN-003", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("ISBN-004", "La casa de los espíritus", 1982, autor3);
        biblioteca.agregarLibro("ISBN-005", "Paula", 1994, autor3);

        // 4. Listar libros
        biblioteca.listarLibros();

        // 5. Buscar libro por ISBN
        System.out.println("Buscando libro con ISBN 'ISBN-003':");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN-003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro.");
        }

        // 6. Filtrar libros por año
        System.out.println("Libros publicados en 1982:");
        List<Libro> filtrados = biblioteca.filtrarLibrosPorAnio(1982);
        for (Libro l : filtrados) {
            l.mostrarInfo();
        }

        // 7. Eliminar libro por ISBN
        System.out.println("Eliminando libro con ISBN 'ISBN-002'...");
        biblioteca.eliminarLibro("ISBN-002");
        biblioteca.listarLibros();

        // 8. Mostrar cantidad de libros
        System.out.println("Cantidad de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar autores
        biblioteca.mostrarAutoresDisponibles();
    }
}