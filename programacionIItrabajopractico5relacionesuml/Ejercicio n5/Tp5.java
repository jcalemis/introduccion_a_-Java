
package tp5;


public class Tp5 {

    public static void main(String[] args) {
        System.out.println("Prueba de relaciones Computadora - Placamadre - Propietario");

        
        Computadora computadora = new Computadora("Lenovo", "SN123456789", "ASUS ROG Strix", "Intel Z790");
        Propietario propietario = new Propietario("Carlos Rodríguez", "34123456");

        System.out.println("1. Objetos creados:");
        System.out.println("   Computadora: " + computadora);
        System.out.println("   Propietario: " + propietario);

        
        System.out.println("\n2. Estableciendo relaciones bidireccionales:");
        computadora.setPropietario(propietario);
        propietario.setComputadora(computadora);

        
        System.out.println("\n3. Verificación de relaciones:");
        System.out.println("   Relación Computadora → Propietario: " + computadora.getPropietario().getNombre());
        System.out.println("   Relación Propietario → Computadora: " + propietario.getComputadora().getMarca());
        System.out.println("   Relación Computadora → PlacaMadre (composición): " + computadora.getPlacaMadre().getModelo());
        System.out.println("   Chipset de la placa madre: " + computadora.getPlacaMadre().getChipset());
        System.out.println("   Número de serie: " + computadora.getNumeroSerie());

        System.out.println("\n4. Estado final de los objetos:");
        System.out.println("   Computadora: " + computadora);
        System.out.println("   Propietario: " + propietario);
        System.out.println("   PlacaMadre: " + computadora.getPlacaMadre());

       
        System.out.println("\n5. Demostración de composición:");
        System.out.println("   La PlacaMadre fue creada dentro de la Computadora");
        System.out.println("   No existe una referencia externa independiente a la PlacaMadre");

        
        System.out.println("\nSegunda instancia");
        Computadora computadora2 = new Computadora("HP", "SN987654321", "Gigabyte Aorus", "AMD X670");
        Propietario propietario2 = new Propietario("Ana Torres", "28987654");

        computadora2.setPropietario(propietario2);
        propietario2.setComputadora(computadora2);

        System.out.println("Segunda computadora: " + computadora2.getMarca());
        System.out.println("Segundo propietario: " + propietario2.getNombre());
        System.out.println("Segunda placa madre: " + computadora2.getPlacaMadre().getModelo());
    }
}
