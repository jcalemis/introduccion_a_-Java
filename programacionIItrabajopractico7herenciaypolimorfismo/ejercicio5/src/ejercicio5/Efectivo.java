package ejercicio5;
public class Efectivo implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Pago realizado con efectivo");
    }
}
