package tp5;

public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; 
    private Mesa mesa;       

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        if (fecha == null || fecha.isBlank()) throw new IllegalArgumentException("Fecha requerida");
        if (hora == null || hora.isBlank()) throw new IllegalArgumentException("Hora requerida");
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }

    @Override
    public String toString() {
        return "Reserva{fecha='" + fecha + "', hora='" + hora + "'" +
               ", cliente=" + (cliente != null ? cliente.getNombre() : "null") +
               ", mesa=" + (mesa != null ? mesa.getNumero() : "null") +
               "}";
    }
}
