
package sumanumerospares;

import java.util.Scanner;


public class SumaNumerosPares {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = 1;
        
        int sumaPares = 0;
        
        while(num != 0){
             System.out.println("Ingrese un numero (0 para terminar)");
             num = Integer.parseInt(input.nextLine());
             
           if(num % 2 == 0){  
               sumaPares = sumaPares + num;
           }   
        }
     
        System.out.println("La suma de los numeros pares es: " + sumaPares);
    
    }
    
    
}
