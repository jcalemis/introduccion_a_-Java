package tp6;

import java.util.ArrayList;
import java.util.List;

class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor() {                    
        this.cursos = new ArrayList<>();
    }

    public Profesor(String id, String nombre, String especialidad) { 
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.remove(c) && c.getProfesor() == this) c.setProfesor(null);
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        for (Curso c : cursos) System.out.println(" - " + c.getCodigo() + " " + c.getNombre());
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | ID: " + id +
                           " | Especialidad: " + especialidad +
                           " | Cursos: " + cursos.size());
    }

    public int cantidadCursos() { return cursos.size(); }
}
