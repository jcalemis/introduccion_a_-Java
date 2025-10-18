
package tp6;

import java.util.List;
public class Tp6 {

  
    public static void main(String[] args) {
        // 1. Crear profesores y cursos
        Profesor prof1 = new Profesor("P1", "Ana Torres", "Matemática");
        Profesor prof2 = new Profesor("P2", "Luis Pérez", "Historia");
        Profesor prof3 = new Profesor("P3", "María Gómez", "Programación");

        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Historia Antigua");
        Curso c3 = new Curso("C103", "Estructuras de Datos");
        Curso c4 = new Curso("C104", "Literatura");
        Curso c5 = new Curso("C105", "Bases de Datos");

        // 2. Crear universidad y agregar
        Universidad uni = new Universidad("Universidad Nacional");
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C102", "P2");
        uni.asignarProfesorACurso("C103", "P3");
        uni.asignarProfesorACurso("C105", "P3");

        // 4. Listar
        uni.listarCursos();
        uni.listarProfesores();

        // 5. Cambiar profesor de un curso
        System.out.println("\n🔄 Cambiando profesor del curso C103...");
        uni.asignarProfesorACurso("C103", "P1");
        uni.listarCursos();
        uni.listarProfesores();

        // 6. Remover un curso
        System.out.println("\n Eliminando curso C102...");
        uni.eliminarCurso("C102");
        uni.listarCursos();
        prof2.listarCursos();

        // 7. Remover un profesor
        System.out.println("\n Eliminando profesor P3...");
        uni.eliminarProfesor("P3");
        uni.listarCursos();
        uni.listarProfesores();

        // 8. Reporte
        System.out.println();
        uni.reporteCursosPorProfesor();
    }
}