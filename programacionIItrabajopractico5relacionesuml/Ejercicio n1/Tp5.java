package tp5;

import java.util.Date;

public class Tp5 {

    public static void main(String[] args) {
        System.out.println("prueba de relaciones entre clases");

        // Primera instancia 
        Titular titular = new Titular("Juan Gomez", 32456789);
        Foto foto = new Foto(1001, "JPG");
        Pasaporte pasaporte = new Pasaporte(912364977, new Date(), titular, foto);
        

        // Verificar relaciones
        System.out.println("1. Relación Pasaporte -> Titular:");
        System.out.println("   Titular del pasaporte: " + pasaporte.getTitular().getNombre());

        System.out.println("\n2. Relación Titular -> Pasaporte:");
        System.out.println("   Pasaporte del titular: " + titular.getPasaporte().getNumero());

        System.out.println("\n3. Relación Pasaporte -> Foto:");
        System.out.println("   Formato de la foto: " + pasaporte.getFoto().getFormato());

        System.out.println("\n4. Verificación completa:");
        System.out.println("   Pasaporte: " + pasaporte);
        System.out.println("   Titular: " + titular);
        System.out.println("   Foto: " + pasaporte.getFoto()); 

        // 
        System.out.println("\n segunda instancia");
        Foto foto2 = new Foto(1002, "PNG");
        Titular titular2 = new Titular("Luis Castillo", 20765124);
        Pasaporte pasaporte2 = new Pasaporte(456987132, new Date(), titular2, foto2);

        System.out.println("Segundo titular: " + titular2.getNombre());
        System.out.println("Segundo pasaporte: " + pasaporte2.getNumero());
        System.out.println("Segundo formato de foto: " + pasaporte2.getFoto().getFormato());
    }
}
