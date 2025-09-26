package tp5;


public class Calculadora {
    
    public void calcular(Impuesto impuesto) {
        double iva = impuesto.getMonto() * 0.21;
        double total = impuesto.getMonto() + iva;

        System.out.println("Calculo de impuesto");
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
        System.out.println("Monto base: $" + impuesto.getMonto());
        System.out.println("IVA (21%): $" + iva);
        System.out.println("Total a pagar: $" + total);
    }
}
