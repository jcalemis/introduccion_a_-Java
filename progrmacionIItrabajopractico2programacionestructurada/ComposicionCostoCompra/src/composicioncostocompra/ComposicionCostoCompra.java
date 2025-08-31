
package composicioncostocompra;

import java.util.Scanner;

public class ComposicionCostoCompra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, precioProducto;
        String zona;

        System.out.println("Ingrese el precio del producto:");
        precioProducto = input.nextDouble();

        System.out.println("Ingrese el peso del paquete:");
        peso = input.nextDouble();
        input.nextLine(); // Limpia el buffer

        System.out.println("Ingrese la zona de envío (Nacional/Internacional):");
        zona = input.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double precioFinal = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: $" + costoEnvio);
        System.out.println("El total a pagar es: $" + precioFinal);

        input.close();
    }

    // Método para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10;
        } else {
            System.out.println("Zona no válida. Se asumirá costo de envío 0.");
        }
        return costoEnvio;
    }

    // Método para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}

