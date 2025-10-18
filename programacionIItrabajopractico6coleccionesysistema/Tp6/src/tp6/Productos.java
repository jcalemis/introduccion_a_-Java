package tp6;

import tp6.CategoriaProductos;

public class Productos {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProductos categoria;

    public Productos(String id, String nombre, double precio, int cantidad, CategoriaProductos categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProductos getCategoria() {
        return categoria;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoria(CategoriaProductos categoria) {
        this.categoria = categoria;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en stock: " + cantidad);
        System.out.println("Categoría: " + categoria + " (" + categoria.getDescripcion() + ")");
        System.out.println("");
        System.out.println(":::::::::::::::::::::::::");
        System.out.println("");
    }
}