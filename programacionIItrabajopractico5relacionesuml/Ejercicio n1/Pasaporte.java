package tp5;

import java.util.Date;

public class Pasaporte {
    private int numero;
    private Date fechaEmision;
    private Foto foto;
    private Titular titular;

    
    public Pasaporte(int numero, Date fechaEmision, Titular titular, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        if (foto == null) throw new IllegalArgumentException("La foto no puede ser nula");
        this.foto = foto;
        setTitular(titular); 
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public Date getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(Date fechaEmision) { this.fechaEmision = fechaEmision; }

    public Foto getFoto() { return foto; }

    public Titular getTitular() { return titular; }

    
    public void setTitular(Titular nuevoTitular) {
        if (this.titular == nuevoTitular) return;

        // Desvincular anterior
        if (this.titular != null) {
            Titular anterior = this.titular;
            this.titular = null;
            if (anterior.getPasaporte() == this) {
                anterior.setPasaporte(null);
            }
        }

        
        this.titular = nuevoTitular;
        if (nuevoTitular != null && nuevoTitular.getPasaporte() != this) {
            nuevoTitular.setPasaporte(this);
        }
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero=" + numero +
                ", fechaEmision=" + fechaEmision +
                ", foto=" + foto +
                ", titular=" + (titular != null ? titular.getNombre() : "null") +
                '}';
    }
}
