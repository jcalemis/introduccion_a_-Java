
package tp5;


public class Tp5 {
    public static void main(String[] args) {
        Artista artista = new Artista("La renga", "Rock");
        Cancion cancion = new Cancion("Hablando de la libertad", artista);
        Reproductor reproductor = new Reproductor();

        System.out.println("Dependencia uso - Reproductor");
        reproductor.reproducir(cancion); 
    }
}
