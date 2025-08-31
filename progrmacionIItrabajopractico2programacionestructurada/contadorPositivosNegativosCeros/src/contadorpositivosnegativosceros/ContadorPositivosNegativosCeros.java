
package contadorpositivosnegativosceros;

import java.util.Scanner;


public class ContadorPositivosNegativosCeros {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0, num;
        
        for (int i = 1; i <= 10; i++){
            System.out.println("Ingrese el numero " + i + ": ");
            num = Integer.parseInt(input.nextLine());
           
            if(num > 0) {
                contadorPositivos++;
            } else if (num < 0 ){
                contadorNegativos++;
            } else if (num == 0){
                contadorCeros++;
            }
        }
    
        System.out.println("Resultados");
        System.out.println("Positivos: " + contadorPositivos + "\n");
        System.out.println("Negativos: " + contadorNegativos + "\n");
        System.out.println("Ceros: " + contadorCeros);
      
    }
    
}
