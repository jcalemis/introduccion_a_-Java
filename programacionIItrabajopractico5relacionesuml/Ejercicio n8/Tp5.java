
package tp5;


public class Tp5 {

    public static void main(String[] args) {
        System.out.println("Prueba de relaciones Documento - Firma Digital - Usuario");

        // Crear objetos
        Usuario usuario = new Usuario("Rodolfo Gomez", "rodogom@gmail.com");

        
        Documento documento = new Documento("Contrato de ServicioLogistica",
                                          "Este es el contenido del contrato...",
                                          "fac4599", "2025-05-20", usuario);

        System.out.println("1. Objetos creados:");
        System.out.println("   Usuario: " + usuario);
        System.out.println("   Documento: " + documento);
        System.out.println("   FirmaDigital: " + documento.getFirmaDigital());

        
        System.out.println("\n2. Verificación de relaciones:");
        System.out.println("   Relación Documento → FirmaDigital (composición): " +
                          documento.getFirmaDigital().getCodigoHash());
        System.out.println("   Relación FirmaDigital → Usuario (agregación): " +
                          documento.getFirmaDigital().getUsuario().getNombre());
        System.out.println("   Fecha de firma: " + documento.getFirmaDigital().getFecha());
        System.out.println("   Email del usuario: " + documento.getFirmaDigital().getUsuario().getEmail());
        System.out.println("   Título del documento: " + documento.getTitulo());

        System.out.println("\n3. Estado final de los objetos:");
        System.out.println("   Documento: " + documento);
        System.out.println("   FirmaDigital: " + documento.getFirmaDigital());
        System.out.println("   Usuario: " + usuario);

        
        System.out.println("\n4. Demostración de composición:");
        System.out.println("   La FirmaDigital fue creada dentro del Documento");
        System.out.println("   No existe una referencia externa independiente a la FirmaDigital");
        System.out.println("   La FirmaDigital no puede existir sin el Documento");

        
        System.out.println("\n5. Demostración de agregación:");
        System.out.println("   El Usuario existe independientemente de la FirmaDigital");
        System.out.println("   Puede haber usuarios sin firmas digitales (agregación)");

        
        System.out.println("\nSegunda instancia");
        Usuario usuario2 = new Usuario("Exequiel Peralta", "exe_wloq@gmail.com");
        Documento documento2 = new Documento("Recibo de visita",
                                           "Compropbante",
                                           "V400505", "2025-02-21", usuario2);

        System.out.println("Segundo documento: " + documento2.getTitulo());
        System.out.println("Segundo usuario: " + documento2.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Segunda firma: " + documento2.getFirmaDigital().getCodigoHash());

        
        System.out.println("\nReutilizacion de Usuario");
        Documento documento3 = new Documento("ServicioLogistica",
                                           "Contenido adicional del contrato...",
                                           "fac600", "2025-05-27", usuario); 

        System.out.println("Tercer documento: " + documento3.getTitulo());
        System.out.println("Mismo usuario: " + documento3.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Nueva firma: " + documento3.getFirmaDigital().getCodigoHash());
    }
}
