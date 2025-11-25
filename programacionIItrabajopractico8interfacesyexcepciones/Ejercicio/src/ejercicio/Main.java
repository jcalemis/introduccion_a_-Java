package Ejercicio;

public class Main {
    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente = new Cliente("Juan");

        // Crear productos
        Producto p1 = new Producto("Yerba", 1500);
        Producto p2 = new Producto("Azúcar", 900);
        Producto p3 = new Producto("Aceite", 2500);

        // Crear pedido asociado al cliente
        Pedido pedido = new Pedido(cliente);

        // Agregar productos
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        // Mostrar productos y total
        System.out.println("------ DETALLE DEL PEDIDO -------");
        System.out.println(pedido);

        // Cambiar estado → notifica al cliente
        pedido.cambiarEstado("PREPARANDO");

        // Calcular total
        double total = pedido.calcularTotal();
        System.out.println("\nTotal del pedido: $" + total);

        // Pago con PayPal
        System.out.println("\n--- Pago con PayPal ---");
        Pago paypal = new PayPal();
        paypal.procesarPago(total);

        // Pago con Tarjeta con descuento
        System.out.println("\n--- Pago con Tarjeta Crédito (10% desc.) ---");
        TarjetaCredito tarjeta = new TarjetaCredito();
        tarjeta.aplicarDescuento(10);
        double totalConDescuento = total * 0.90;  // 10% off
        tarjeta.procesarPago(totalConDescuento);

        System.out.println("\n------ FIN DEL PROGRAMA -------");
    }
}
