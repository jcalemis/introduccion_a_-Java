package capturardatos;

import java.util.Scanner;
public class CapturarDatos {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Por favor, ingresa tu nombre");
      String nombre = scanner.nextLine();
      System.out.println("Ahora ingresa tu edad");
      int edad = scanner.nextInt();
      System.out.println("/n--- informacion del usuario ---");
      System.out.println("Nombre  " + nombre);
      System.out.println("Edad:  " + edad + " anios");
      scanner.close();
      
      
              
    }
    
}
