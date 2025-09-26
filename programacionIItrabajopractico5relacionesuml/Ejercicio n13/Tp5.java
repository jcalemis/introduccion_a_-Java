
package tp5;


public class Tp5 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Claudio Gomez", "claudiolog@gmail.com");
        GeneradorQR generador = new GeneradorQR();

        System.out.println("Dependecia de creacion - Generador QR");
        generador.generar("https://www.logservi.com", usuario); 
    }
}
