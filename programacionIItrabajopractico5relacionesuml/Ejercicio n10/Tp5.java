
package tp5;


public class Tp5 {

    public static void main(String[] args) {
        System.out.println("Prueba de relacions Cuenta Bancaria - Clave Seguridad - Titular");

      
        Titular titular = new Titular("Claudio Gomez", "20125698");

       
        CuentaBancaria cuenta = new CuentaBancaria("0009987890123456789012",
                                                  95000.75,
                                                  "366998",
                                                  "2025-07-25",
                                                  titular);

        System.out.println("1. Objetos creados:");
        System.out.println("   Titular: " + titular);
        System.out.println("   Cuenta Bancaria: " + cuenta);
        System.out.println("   Clave Seguridad: " + cuenta.getClaveSeguridad());

        
        System.out.println("\n2. Verificación de relaciones:");
        System.out.println("   Relación CuentaBancaria → ClaveSeguridad (composición): " +
                          cuenta.getClaveSeguridad().getCodigo());
        System.out.println("   Relación CuentaBancaria → Titular (bidireccional): " +
                          cuenta.getTitular().getNombre());
        System.out.println("   Relación Titular → CuentaBancaria (bidireccional): " +
                          titular.getCuentaBancaria().getCbu());
        System.out.println("   Última modificación de clave: " + cuenta.getClaveSeguridad().getUltimaModificacion());
        System.out.println("   DNI del titular: " + titular.getDni());
        System.out.println("   Saldo de la cuenta: $" + cuenta.getSaldo());
        System.out.println("   CBU: " + cuenta.getCbu());

        System.out.println("\n3. Estado final de los objetos:");
        System.out.println("   Cuenta Bancaria: " + cuenta);
        System.out.println("   Clave Seguridad: " + cuenta.getClaveSeguridad());
        System.out.println("   Titular: " + titular);

        
        System.out.println("\n4. Demostración de composición:");
        System.out.println("   La ClaveSeguridad fue creada dentro de la CuentaBancaria");
        System.out.println("   No existe una referencia externa independiente a la ClaveSeguridad");
        System.out.println("   La ClaveSeguridad no puede existir sin la CuentaBancaria");

        
        System.out.println("\n5. Demostración de asociación bidireccional:");
        System.out.println("   La CuentaBancaria conoce al Titular y el Titular conoce la CuentaBancaria");
        System.out.println("   Cambios en una dirección se reflejan automáticamente en la otra");

        
        System.out.println("\nSegunda intsancia");
        Titular titular2 = new Titular("Sandro Espindola", "39987654");
        CuentaBancaria cuenta2 = new CuentaBancaria("0009987890123456765025",
                                                   500000000.25,
                                                   "777998",
                                                   "2025-08-16",
                                                   titular2);

        System.out.println("Segunda cuenta: CBU " + cuenta2.getCbu() + " - Saldo: $" + cuenta2.getSaldo());
        System.out.println("Segundo titular: " + titular2.getNombre());
        System.out.println("Segunda clave: " + cuenta2.getClaveSeguridad().getCodigo());

        
        System.out.println("\nCambio de Titular");
        Titular titular3 = new Titular("Santiago Garcia", "32123456");
        cuenta2.setTitular(titular3);

        System.out.println("Nuevo titular de la segunda cuenta: " + cuenta2.getTitular().getNombre());
        System.out.println("Cuenta asociada al nuevo titular: " + titular3.getCuentaBancaria().getCbu());
    }
}
