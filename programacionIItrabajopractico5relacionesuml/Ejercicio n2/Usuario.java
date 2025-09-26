package tp5;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre requerido");
        if (dni == null || dni.isBlank()) throw new IllegalArgumentException("DNI requerido");
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public Celular getCelular() { return celular; }

    /** Mantiene la asociación bidireccional coherente */
    public void setCelular(Celular nuevoCelular) {
        if (this.celular == nuevoCelular) return;

        // Desvincular anterior
        if (this.celular != null) {
            Celular anterior = this.celular;
            this.celular = null;
            if (anterior.getUsuario() == this) {
                anterior.setUsuario(null);
            }
        }

        // Vincular nuevo
        this.celular = nuevoCelular;
        if (nuevoCelular != null && nuevoCelular.getUsuario() != this) {
            nuevoCelular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', dni='" + dni + "'" +
               ", celular=" + (celular != null ? (celular.getMarca() + " " + celular.getModelo()) : "null") + "}";
    }
}
