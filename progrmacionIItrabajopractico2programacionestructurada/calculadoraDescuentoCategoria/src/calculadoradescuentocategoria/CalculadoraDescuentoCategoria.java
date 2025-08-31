package calculadoradescuentocategoria;
import java.util.Scanner;
public class CalculadoraDescuentoCategoria {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int precio;
      double precioConDescuento;
      char categoria;
      System.out.println("Ingrese el precio del producto");
      precio = Integer.parseInt(input.nextLine());
      
      System.out.println("Ingrese la categoria del prodcuto (A, B o C)");
      categoria = input.nextLine().charAt(0);
      switch(categoria){
          case 'A':
          case 'a':
              precioConDescuento = precio - (precio * 0.10);
              System.out.println("Descuento aplicada 10%");
              System.out.println("");
              System.out.println("Precio final: $" + precioConDescuento);
              break;
          case 'B':
          case 'b':
              precioConDescuento = precio - (precio * 0.15);
              System.out.println("Descuento aplicada 15%");
              System.out.println("");
              System.out.println("Precio final: $" + precioConDescuento);
              break;
          case 'C':
          case 'c':
              precioConDescuento = precio - (precio * 0.20);
              System.out.println("Descuento aplicada 20%");
              System.out.println("");
              System.out.println("Precio final: $" + precioConDescuento);
              break;
              
          default:
              System.out.println("No ingreso una categoria valida");
              break;
      }
      
    }
    
}
