package Ejercicio;

public class PruebaEdadInvalidaValida {

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        }
        System.out.println("Edad válida: " + edad);
    }

    public static void main(String[] args) throws EdadInvalidaException {

        System.out.println("Inicio del programa...");

        // EJECUCIÓN INVÁLIDA: sin try-catch
        validarEdad(-10);

        System.out.println("Fin del programa"); // NO se ejecut
    }
}
