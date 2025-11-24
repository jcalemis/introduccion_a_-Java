package ejercicio33;

public class Empleado {

    public double calcularSueldo(Empleado e) {

        // Sueldo para empleados de planta
        if (e instanceof EmpleadoPlanta) {
            return 900000.0;
        }

        // Sueldo para empleados temporales
        if (e instanceof EmpleadoTemporal) {
            return 850000.0;
        }

        return 0.0;
    }
}
