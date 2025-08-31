
package determinarmayortresnumeros;

import java.util.Scanner;


public class DeterminarMayorTresNumeros {

  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int numUno, numDos, numTres, mayor;
       
       System.out.println("Ingrese 3 números");
       System.out.println("Primer número:  ");
       numUno = Integer.parseInt(input.nextLine());
       System.out.println("Segundo número:  ");
       numDos = Integer.parseInt(input.nextLine());
       System.out.println("Tercer número:  ");
       numTres = Integer.parseInt(input.nextLine());
       
       mayor = numUno;
       
       if (numDos > mayor) {
          mayor = numDos;
       }
       if (numTres > mayor) { 
          mayor = numTres;   
       }
       System.out.println("El mayor es:  " + mayor);
       }
    
}
