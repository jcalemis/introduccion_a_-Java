
package tp5;


public class Tp5 {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Juan Rolon", "20-28458698-5");
        Impuesto impuesto = new Impuesto(50000.0, contribuyente);
        Calculadora calculadora = new Calculadora();

        System.out.println("Dependecia de uso - Calculadora");
        calculadora.calcular(impuesto); 
    }
}
