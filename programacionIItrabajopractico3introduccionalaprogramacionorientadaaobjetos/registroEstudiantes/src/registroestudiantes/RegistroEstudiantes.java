package registroestudiantes;

public class RegistroEstudiantes {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.mostrarInfo();
        estudiante.subirCalificacion(2);
        estudiante.mostrarInfo();
        estudiante.bajarCalificacion(1);
        estudiante.mostrarInfo();
    } 

    public static class Estudiante {
        String nombre = "Juan";
        String apellido = "Perez";
        String curso = "Programación 2";
        int calificacion = 7;

        public void mostrarInfo() {
            System.out.println(
                "El estudiante " + nombre + " " + apellido +
                " cursa " + curso +
                " y su nota es " + calificacion
            );
        }

        public void subirCalificacion(int puntos) {
            calificacion += puntos;
        }

        public void bajarCalificacion(int puntos) {
            calificacion -= puntos;
        }
    }
}
