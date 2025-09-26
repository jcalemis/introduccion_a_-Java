package tp5;

public class Tp5 {

    public static void main(String[] args) {
        System.out.println("Prueba de relaciones celular - bateria - usuario");

        //  objetos
        Bateria bateria = new Bateria("Sam", 3500);
        Usuario usuario = new Usuario("Juan Duette", "38785963");
        Celular celular = new Celular("353871617270381", "Samsung", "A54", bateria);

        System.out.println("1. Objetos creados:");
        System.out.println("   Batería: " + bateria);
        System.out.println("   Usuario: " + usuario);
        System.out.println("   Celular: " + celular);

        
        System.out.println("\n2. Estableciendo relaciones bidireccionales:");
        celular.setUsuario(usuario);

        // Verificar relaciones
        System.out.println("\n3. Verificación de relaciones:");
        System.out.println("   Relación Celular → Batería: " + celular.getBateria().getModelo());
        System.out.println("   Relación Celular → Usuario: " + celular.getUsuario().getNombre());
        System.out.println("   Relación Usuario → Celular: " + usuario.getCelular().getMarca());

        System.out.println("\n4. Estado final de los objetos:");
        System.out.println("   Celular: " + celular);
        System.out.println("   Usuario: " + usuario);
        System.out.println("   Batería: " + bateria);

        // Prueba de AGREGACIÓN (reemplazo de batería)
        System.out.println("\nprueba de agregacion(cambio de batería)");
        Bateria repuesto = new Bateria("Sam nuevo", 4500);
        celular.setBateria(repuesto);
        System.out.println("Batería actual del celular: " + celular.getBateria());

        // Segunda instancia
        System.out.println("\n Segunda instancia");
        Bateria bateria2 = new Bateria("Sam 150", 5000);
        Usuario usuario2 = new Usuario("Francisco Talavera", "32456987");
        Celular celular2 = new Celular("987654321098765", "Xiaomi", "Redmi note 13", bateria2);

        celular2.setUsuario(usuario2);

        System.out.println("Segundo usuario: " + usuario2.getNombre());
        System.out.println("Segundo celular: " + celular2.getModelo());
        System.out.println("Segunda batería: " + bateria2.getCapacidad() + "mAh");
    }
}
