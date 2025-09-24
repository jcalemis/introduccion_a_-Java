
package registromascotas2;


public class Registromascotas2 {

  
    public static void main(String[] args) {
         Mascota mascota = new Mascota();
        mascota.mostrarInfo();     
        mascota.cumplirAnios();    
        mascota.mostrarInfo();     
        mascota.cumplirAnios();    
        mascota.mostrarInfo();     
    }

    public static class Mascota {
        String nombre = "Roco";
        String especie = "Perro";
        int edad = 3;

        public void mostrarInfo() {
            System.out.println(
                "La mascota " + nombre +
                " es un " + especie +
                " tiene " + edad + " años."
            );
        }

        public void cumplirAnios() {
            edad++;
        }
    }
}