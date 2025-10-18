
package tp6;

public class tp6 {

    
    public static void main(String[] args) {
         // Crear inventario
        Inventario inventario = new Inventario();
        
        Productos p1 = new Productos("P001", "Arroz", 1250, 45, CategoriaProductos.ALIMENTOS);
        Productos p2 = new Productos("P002", "Celular", 195000, 4, CategoriaProductos.ELECTRONICA);
        Productos p3 = new Productos("P003", "Remera", 3500, 15, CategoriaProductos.ROPA);
        Productos p4 = new Productos("P004", "Sillon", 200000, 10, CategoriaProductos.HOGAR);
        Productos p5 = new Productos("P005", "Pan", 500, 100, CategoriaProductos.ALIMENTOS);

        inventario.agregarProductos(p1);
        inventario.agregarProductos(p2);
        inventario.agregarProductos(p3);
        inventario.agregarProductos(p4);
        inventario.agregarProductos(p5);

        // 2. Listar todos los productos
        System.out.println(":::::::::: LISTA DE PRODUCTOS ::::::::::");
        System.out.println("");
        inventario.listarProductos();
        
        // 3. Buscar un producto por ID
        System.out.println(":::::::::: BUSCAR PRODUCTO P003 ::::::::::");
        System.out.println("");
        Productos buscado = inventario.buscarProductosPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar y mostrar productos de una categoría
        System.out.println(":::::::::: FILTRAR POR CATEGORÍA: ALIMENTOS ::::::::::");
        System.out.println("");
        inventario.filtrarPorCategoria(CategoriaProductos.ALIMENTOS);

        // 5. Eliminar un producto y listar los restantes
        System.out.println(":::::::::: ELIMINAR PRODUCTO P002 :::::::::: ");
        System.out.println("");
        inventario.eliminarProductos("P002");
        inventario.listarProductos();

        // 6. Actualizar el stock de un producto
        System.out.println(":::::::::: ACTUALIZAR STOCK P001 ::::::::::");
        System.out.println("");
        inventario.actualizarStock("P001", 70);
        inventario.buscarProductoPorId("P001").mostrarInfo();

        // 7. Mostrar total de stock disponible
        System.out.println(":::::::::: TOTAL DE STOCK DISPONIBLE:::::::::: ");
        System.out.println("");
        System.out.println("Total stock: " + inventario.obtenerTotalStock());

        // 8. Obtener y mostrar el producto con mayor stock
        System.out.println(":::::::::: PRODUCTO CON MAYOR STOCK ::::::::::");
        Productos mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // 9. Filtrar productos por precio entre $1000 y $3000
        System.out.println(":::::::::: PRODUCTOS ENTRE $1000 y $3000:::::::::: ");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías disponibles
        System.out.println(":::::::::: CATEGORÍAS DISPONIBLES::::::::::");
        inventario.mostrarCategoriasDisponibles();
    }
}