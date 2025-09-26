
package tp5;


public class Tp5 {

    public static void main(String[] args) {
        System.out.println("Prueba de relaciones Vehiculo - Motor - Conductor");

        
        Motor motor = new Motor("1.6", "KL23456789");
        Conductor conductor = new Conductor("Francisco Talavera", "A123");
        Vehiculo vehiculo = new Vehiculo("LFK456", "Volkswagen Saveiro", motor);

        System.out.println("1. Objetos creados:");
        System.out.println("   Motor: " + motor);
        System.out.println("   Conductor: " + conductor);
        System.out.println("   Vehículo: " + vehiculo);

        
        System.out.println("\n2. Estableciendo relaciones bidireccionales:");
        vehiculo.setConductor(conductor);
        
        
        System.out.println("\n3. Verificación de relaciones:");
        System.out.println("   Relación Vehículo → Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("   Relación Conductor → Vehículo: " + conductor.getVehiculo().getModelo());
        System.out.println("   Relación Vehículo → Motor (agregación): " + vehiculo.getMotor().getTipo());
        System.out.println("   Número de serie del motor: " + vehiculo.getMotor().getNumeroSerie());
        System.out.println("   Licencia del conductor: " + conductor.getLicencia());
        System.out.println("   Patente del vehículo: " + vehiculo.getPatente());

        System.out.println("\n4. Estado final de los objetos:");
        System.out.println("   Vehículo: " + vehiculo);
        System.out.println("   Conductor: " + conductor);
        System.out.println("   Motor: " + motor);

        
        System.out.println("\n5. Demostración de agregación:");
        System.out.println("   El Motor existe independientemente del Vehículo");
        System.out.println("   Puede haber motores sin vehículos (agregación)");

        
        System.out.println("\n6. Demostración de asociación bidireccional:");
        System.out.println("   El Vehículo conoce al Conductor y el Conductor conoce el Vehículo");
        System.out.println("   Cambios en una dirección se reflejan en la otra");

        
        System.out.println("\nSegunda instancia");
        Motor motor2 = new Motor("3.0", "F45697");
        Conductor conductor2 = new Conductor("Santiago Robin", "A458");
        Vehiculo vehiculo2 = new Vehiculo("MNX489", "TOYOTA HILUX", motor2);

        vehiculo2.setConductor(conductor2);

        System.out.println("Segundo vehículo: " + vehiculo2.getModelo() + " (" + vehiculo2.getPatente() + ")");
        System.out.println("Segundo conductor: " + conductor2.getNombre());
        System.out.println("Segundo motor: " + motor2.getTipo());

        
        System.out.println("\n Reutilizacion del motor");
        Vehiculo vehiculo3 = new Vehiculo("PQE489", "RENAULT DUSTER", motor); 
        System.out.println("Tercer vehículo: " + vehiculo3.getModelo() +
                          " con motor " + vehiculo3.getMotor().getTipo() +
                          " (n° serie: " + vehiculo3.getMotor().getNumeroSerie() + ")");
    }
}
