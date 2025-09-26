
package tp5;


public class Tp5 {

    public static void main(String[] args) {
        System.out.println("Prueba de relacions CitaMedica - Paciente - Profesional");

        // Crear objetos
        Paciente paciente = new Paciente("Luz Gomez", "IOSCOR");
        Profesional profesional = new Profesional("Dr. Guido Sanchez", "Neurolgo");
        CitaMedica citaMedica = new CitaMedica("2023-12-19", "10:30", paciente, profesional);

        System.out.println("1. Objetos creados:");
        System.out.println("   Paciente: " + paciente);
        System.out.println("   Profesional: " + profesional);
        System.out.println("   Cita Médica: " + citaMedica);

        
        System.out.println("\n2. Verificación de relaciones unidireccionales:");
        System.out.println("   Relación CitaMédica → Paciente: " + citaMedica.getPaciente().getNombre());
        System.out.println("   Obra social del paciente: " + citaMedica.getPaciente().getObraSocial());
        System.out.println("   Relación CitaMédica → Profesional: " + citaMedica.getProfesional().getNombre());
        System.out.println("   Especialidad del profesional: " + citaMedica.getProfesional().getEspecialidad());
        System.out.println("   Fecha de la cita: " + citaMedica.getFecha());
        System.out.println("   Hora de la cita: " + citaMedica.getHora());

        System.out.println("\n3. Estado final de los objetos:");
        System.out.println("   Cita Médica: " + citaMedica);
        System.out.println("   Paciente: " + paciente);
        System.out.println("   Profesional: " + profesional);

        
        System.out.println("\n4. Demostración de asociaciones unidireccionales:");
        System.out.println("   La CitaMédica conoce al Paciente, pero el Paciente no tiene referencia a la CitaMédica");
        System.out.println("   La CitaMédica conoce al Profesional, pero el Profesional no tiene referencia a la CitaMédica");
        System.out.println("   Esto son asociaciones unidireccionales: CitaMédica → Paciente y CitaMédica → Profesional");

        
        System.out.println("\n5. Flexibilidad de asociaciones unidireccionales:");
        System.out.println("   Un mismo paciente puede tener múltiples citas con diferentes profesionales");
        System.out.println("   Un mismo profesional puede atender múltiples citas con diferentes pacientes");

  
        System.out.println("\nSegunda instancia");
        Paciente paciente2 = new Paciente("Juan Moreira", "OSDE");
        Profesional profesional2 = new Profesional("Dr.Juan Perez", "Nefrologo");
        CitaMedica citaMedica2 = new CitaMedica("2023-12-19", "11:45", paciente2, profesional2);

        System.out.println("Segunda cita: " + citaMedica2.getFecha() + " a las " + citaMedica2.getHora());
        System.out.println("Segundo paciente: " + citaMedica2.getPaciente().getNombre());
        System.out.println("Segundo profesional: " + citaMedica2.getProfesional().getNombre());

        
        System.out.println("\n Reutilizaicon Paciente y Profesional");
        CitaMedica citaMedica3 = new CitaMedica("2023-12-28", "09:00", paciente, profesional2); 
        CitaMedica citaMedica4 = new CitaMedica("2023-12-10", "16:00", paciente2, profesional); // Diferente paciente, mismo profesional

        System.out.println("Tercera cita: " + paciente.getNombre() + " con " + profesional2.getEspecialidad());
        System.out.println("Cuarta cita: " + paciente2.getNombre() + " con " + profesional.getEspecialidad());
    }
}
