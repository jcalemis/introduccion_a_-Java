
package operacionesarimeticas;

import java.util.Scanner;
public class OperacionesArimeticas {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingresa el primer número entero: ");
       int num1  = scanner.nextInt();
       System.out.print("Ingrese el segundo número entero ");
       int num2 = scanner.nextInt();
       int suma = num1 + num2;
       int resta = num1 - num2;
       int multiplicacion = num1 + num2;
       double division = (double) num1 / num2;
       
       System.out.println("\n--- Resultados ---");
       System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
       System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
       System.out.println("Multiplicacion:  " + num1 + " * " + num2 + " = " + multiplicacion);
       System.out.println("División: " + num1 + " / " + num2 + " = " + division);
       
       scanner.close();
       
       
    }
    
}
