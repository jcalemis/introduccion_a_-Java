package ejercicio5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pagable> pagos = new ArrayList<>();

        pagos.add(new TarjetaCredito());
        pagos.add(new Transferencia());
        pagos.add(new Efectivo());

        for (Pagable medio : pagos) {
            procesoPago(medio);
        }
    }

    public static void procesoPago(Pagable medio) {
        medio.pagar();
    }
}
