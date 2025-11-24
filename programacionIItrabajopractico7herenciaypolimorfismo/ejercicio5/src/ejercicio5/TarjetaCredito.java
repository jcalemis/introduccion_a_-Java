package ejercicio5;
public class TarjetaCredito implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Pago realizado con tarjeta de crédito");
    }
}
