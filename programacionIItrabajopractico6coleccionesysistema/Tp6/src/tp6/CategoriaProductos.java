package tp6;



public enum CategoriaProductos {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    // Atributoa
    private final String descripcion;

    // Constructor 
    CategoriaProductos(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public String getDescripcion() {
        return descripcion;
    }
}