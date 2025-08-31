
package impresionrecursiva;

public class ImpresionRecursiva {

  
public static void mostrarPreciosRecursivo(double[] precios, int index) {
    if (index >= precios.length) {
        return;
    }
    System.out.println("Precio: " + precios[index]);
    mostrarPreciosRecursivo(precios, index + 1);
}

    public static void main(String[] args) {
        
        double[] precios = {199.99, 259.5, 149.75, 399.0, 89.95};

    System.out.println("Precios originales:");
    mostrarPreciosRecursivo(precios, 0);

    precios[2] = 129.99;

    System.out.println("Precios modificados:");
    mostrarPreciosRecursivo(precios, 0);


    }
    
}
