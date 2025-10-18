package tp6;

import java.util.ArrayList;

public class Inventario {
    // Atributo
    private ArrayList<Productos> productos;

    // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    
    public void agregarProducto(Productos p) {
        if (p == null) return;
        productos.add(p);
    }

  
    public void agregarProductos(Productos... ps) {
        if (ps == null) return;
        for (Productos p : ps) {
            agregarProducto(p);
        }
    }

    // ===== Listado =====
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (Productos p : productos) {
                p.mostrarInfo();
            }
        }
    }

    
    public Productos buscarProductoPorId(String id) {
        if (id == null) return null;
        for (Productos p : productos) {
            if (id.equalsIgnoreCase(p.getId())) {
                return p;
            }
        }
        return null;
    }

    
    public Productos buscarProductosPorId(String id) {
        return buscarProductoPorId(id);
    }

   
    public void eliminarProducto(String id) {
        Productos encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            System.out.println("Producto con ID " + id + " eliminado.");
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }

   
    public void eliminarProductos(String id) {
        eliminarProducto(id);
    }

   
    public void actualizarStock(String id, int nuevaCantidad) {
        Productos encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            encontrado.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para producto " + id);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

  
    public void filtrarPorCategoria(CategoriaProductos categoria) {
        for (Productos p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
            }
        }
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Productos p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Productos obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Productos max = productos.get(0);
        for (Productos p : productos) {
            if (p.getCantidad() > max.getCantidad()) {
                max = p;
            }
        }
        return max;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        for (Productos p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProductos c : CategoriaProductos.values()) {
            System.out.println(c + " → " + c.getDescripcion());
        }
    }
}
