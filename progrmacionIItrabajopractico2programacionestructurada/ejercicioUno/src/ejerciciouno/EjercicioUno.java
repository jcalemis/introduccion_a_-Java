
package ejerciciouno;
import java.util.Scanner;

public class EjercicioUno {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int anio;
       
       System.out.println("Ingrese un año para verificar si es bisiesto");
       anio = Integer.parseInt(input.nextLine());
       
       if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0 )){
           System.out.println("El año  "  + anio +  "  es bisiesto");
        } else {
           System.out.println("El año  " + anio + "  no es bisiesto");
        }
           
    }
    
}
