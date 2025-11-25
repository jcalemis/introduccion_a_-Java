
package Ejercicio;

public class TarjetaCredito implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta procesado: $" + monto);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Se aplicó un descuento del " + porcentaje + "% en tarjeta de crédito");
    }
}