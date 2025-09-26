package tp5;

public class Bateria {
    private String modelo;
    private int capacidad; // mAh

    public Bateria(String modelo, int capacidad) {
        if (modelo == null || modelo.isBlank()) throw new IllegalArgumentException("Modelo de batería requerido");
        if (capacidad <= 0) throw new IllegalArgumentException("Capacidad debe ser positiva");
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    @Override
    public String toString() {
        return "Bateria{modelo='" + modelo + "', capacidad=" + capacidad + "mAh}";
    }
}
