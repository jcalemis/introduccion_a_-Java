package ejercicio33;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Inicializamos un array de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Creamos empleados y los agregamos al array
        EmpleadoPlanta e1 = new EmpleadoPlanta();
        EmpleadoPlanta e2 = new EmpleadoPlanta();
        EmpleadoTemporal e3 = new EmpleadoTemporal();
        EmpleadoTemporal e4 = new EmpleadoTemporal();

        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);

        int i = 0; // Variable solo para ver el índice en el for, OPCIONAL.

        // Recorremos el array de empleados y llamamos al método para calcular sueldo
        for (Empleado e : empleados) {
            System.out.println("El empleado " + i + " cobra: " + e.calcularSueldo(e));
            i++; // Incrementamos el índice
        }
    }
}
