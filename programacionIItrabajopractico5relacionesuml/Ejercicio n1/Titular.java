package tp5;

public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public Pasaporte getPasaporte() { return pasaporte; }

    
    public void setPasaporte(Pasaporte nuevoPasaporte) {
        if (this.pasaporte == nuevoPasaporte) return;

       
        if (this.pasaporte != null) {
            Pasaporte anterior = this.pasaporte;
            this.pasaporte = null;
            if (anterior.getTitular() == this) {
                anterior.setTitular(null);
            }
        }

       
        this.pasaporte = nuevoPasaporte;
        if (nuevoPasaporte != null && nuevoPasaporte.getTitular() != this) {
            nuevoPasaporte.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{" +
               "nombre='" + nombre + '\'' +
               ", dni=" + dni +
               ", pasaporteNumero=" + (pasaporte != null ? pasaporte.getNumero() : "null") +
               '}';
    }
}
