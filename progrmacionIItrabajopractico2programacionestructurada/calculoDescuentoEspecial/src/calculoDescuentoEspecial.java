import java.util.Scanner;

public class calculoDescuentoEspecial{
    
    public static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto");
        double precio = input.nextDouble();

        calcularDescuentoEspecial(precio);
    }

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento aplicado es de: " + descuentoAplicado);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
}

