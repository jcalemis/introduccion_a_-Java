
package tp5;


public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public TarjetaDeCredito getTarjeta() { return tarjeta; }
    public void setTarjeta(TarjetaDeCredito tarjeta) { this.tarjeta = tarjeta; }

    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', dni='" + dni +
               "', tarjeta=" + (tarjeta != null ? tarjeta.getNumero() : "null") + "}";
    }
}
