package tp5;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;   
    private Usuario usuario;   

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        if (imei == null || imei.isBlank()) throw new IllegalArgumentException("IMEI requerido");
        if (marca == null || marca.isBlank()) throw new IllegalArgumentException("Marca requerida");
        if (modelo == null || modelo.isBlank()) throw new IllegalArgumentException("Modelo requerido");
        // En agregación, la batería puede existir fuera del celular y ser reemplazada:
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; 
    }

    public String getImei() { return imei; }
    public void setImei(String imei) { this.imei = imei; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public Bateria getBateria() { return bateria; }
    public void setBateria(Bateria bateria) { this.bateria = bateria; } 

    public Usuario getUsuario() { return usuario; }

    /** Mantiene la asociación bidireccional coherente */
    public void setUsuario(Usuario nuevoUsuario) {
        if (this.usuario == nuevoUsuario) return;

        // Desvincular anterior
        if (this.usuario != null) {
            Usuario anterior = this.usuario;
            this.usuario = null;
            if (anterior.getCelular() == this) {
                anterior.setCelular(null);
            }
        }

        // Vincular nuevo
        this.usuario = nuevoUsuario;
        if (nuevoUsuario != null && nuevoUsuario.getCelular() != this) {
            nuevoUsuario.setCelular(this);
        }
    }

    @Override
    public String toString() {
        return "Celular{imei='" + imei + "', marca='" + marca + "', modelo='" + modelo + "'" +
               ", bateria=" + (bateria != null ? bateria.getModelo() : "null") +
               ", usuario=" + (usuario != null ? usuario.getNombre() : "null") + "}";
    }
}
