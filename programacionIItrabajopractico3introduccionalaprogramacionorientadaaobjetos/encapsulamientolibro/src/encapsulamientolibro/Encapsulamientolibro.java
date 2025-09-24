package encapsulamientolibro;

import java.time.Year;
public class Encapsulamientolibro {

    public static void main(String[] args) {
      Libro libro = new Libro();
        System.out.println(libro.setAñoPublicacion(1989));
        System.out.println(libro.getAñoPublicacion());
        System.out.println(libro.setAñoPublicacion(1999));
    }
    public static class Libro {
        String titulo = "El Poder del Ahora";
        String autor = "Eckhart Tolle";
        int añoPublicacion = 1999;

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }
        public int getAñoPublicacion() {
            return añoPublicacion;
        }

        public String setAñoPublicacion(int año) {
            if (año >= Year.now().getValue()) {
                return "Error en el año de publicacion";
            } else {
                this.añoPublicacion = año;
                return "Año de publicación correcto: " + año;
            }
        }
    }
}