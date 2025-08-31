
package calculopreciofinal;

import java.util.Scanner;


public class CalculoPrecioFinal {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precio, impuesto, descuento;
        
        System.out.println("Ingrese el precio del producto");
        precio = (double)input.nextDouble();
        
        
        System.out.println("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        impuesto = (double)input.nextDouble();
        
        System.out.println("Ingrese el impuesto en porcentaje (Ej: 5 para 5%): ");
        descuento = (double)input.nextDouble();
        
        double precioFinal = calcularPrecioFinal(precio, impuesto, descuento);
        
        System.out.println("El precio final del producto es: $" + precioFinal);
    }

    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioFinal = precioBase + ((precioBase * impuesto)/100) - ((precioBase * descuento)/100);
        return precioFinal;

    }    
    
}
