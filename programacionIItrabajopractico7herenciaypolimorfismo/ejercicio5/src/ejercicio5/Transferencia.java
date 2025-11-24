package ejercicio5;
public class Transferencia implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Pago realizado con transferencia");
    }
}
