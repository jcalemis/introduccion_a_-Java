package tp5;

public class Tp5 {

    public static void main(String[] args) {
        System.out.println("Prueba de relaciones Reserva - Cliente - Mesa");

        // Crear objetos
        Cliente cliente = new Cliente("Lourdes Romero", "3795454849");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-07-25", "21:30", cliente, mesa);

        System.out.println("1. Objetos creados:");
        System.out.println("   Cliente: " + cliente);
        System.out.println("   Mesa: " + mesa);
        System.out.println("   Reserva: " + reserva);

        //
        System.out.println("\n2. Verificación de relaciones:");
        System.out.println("   Relación Reserva → Cliente (unidireccional): " + reserva.getCliente().getNombre());
        System.out.println("   Teléfono del cliente: " + reserva.getCliente().getTelefono());
        System.out.println("   Relación Reserva → Mesa (agregación): " + reserva.getMesa().getNumero());
        System.out.println("   Capacidad de la mesa: " + reserva.getMesa().getCapacidad() + " personas");
        System.out.println("   Fecha de reserva: " + reserva.getFecha());
        System.out.println("   Hora de reserva: " + reserva.getHora());

        System.out.println("\n3. Estado final de los objetos:");
        System.out.println("   Reserva: " + reserva);
        System.out.println("   Cliente: " + cliente);
        System.out.println("   Mesa: " + mesa);

        /
        System.out.println("\n4. Demostración de asociación unidireccional:");
        System.out.println("   La Reserva conoce al Cliente, pero el Cliente no tiene referencia a la Reserva");

        
        System.out.println("\n5. Demostración de agregación:");
        System.out.println("   La Mesa existe independientemente de la Reserva");

        // Segunda instancia
        System.out.println("\nSegunda instancia");
        Cliente cliente2 = new Cliente("Juan Pérez", "3795784596");
        Mesa mesa2 = new Mesa(8, 6);
        Reserva reserva2 = new Reserva("2025-07-28", "21:00", cliente2, mesa2);

        System.out.println("Segunda reserva: " + reserva2.getFecha() + " a las " + reserva2.getHora());
        System.out.println("Segundo cliente: " + reserva2.getCliente().getNombre());
        System.out.println("Segunda mesa: N°" + reserva2.getMesa().getNumero() +
                           " (capacidad: " + reserva2.getMesa().getCapacidad() + ")");

        // 
        System.out.println("\nReutilazcion de mesa");
        Reserva reserva3 = new Reserva("2024-03-17", "19:00", cliente, mesa);
        System.out.println("Tercera reserva: Mesa " + reserva3.getMesa().getNumero() +
                           " reservada nuevamente para " + reserva3.getCliente().getNombre());
    }
}
