
package estructurascontrol;
import java.util.Scanner;

public class ForEjemplo {
    public static void main(String[] args) {
       
       
       /*
       Ejemplo 1
       for(int numero = 7, x = 1; x < 10; System.out.println(numero * x), x++);
        
       Ejemplo 2
       for(int numero = 7, x = 1; x < 10;){
            System.out.println(numero);
       };
        
       Ejercicio for suave
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number of table you desire to know: ");
       int number = scanner.nextInt();
       
       for (int x = 1; x <= 10;){
       
           System.out.println(x + " x " + number + " = " + (number * x));
           x++;
           
       }
       Ejercicio for suave
       
       
       for (int x = 100; x >= 0;){
       
           System.out.println(x);
           x = x - 6;
           
       }

       Ejercicio for medio        
       */
       
       Scanner scanner = new Scanner(System.in);
       int sum = 0;
       int evenCounter = 0;
       int oddCounter = 0;

       for (int x = 1; x <= 10;){
       
         System.out.println("Enter a number: ");  
         int number = scanner.nextInt();
         sum = sum + number;
         
         if (number < 0){
         
             oddCounter++;
             
         } else {
         
             evenCounter++;
             
         }
         
         x++;
           
       }
       
       System.out.println("The addition of the numbers you entered is: " + sum);
       System.out.println("Even numbers entered: " + evenCounter);
       System.out.println("Even numbers entered: " + oddCounter);
       
    }
 
}
