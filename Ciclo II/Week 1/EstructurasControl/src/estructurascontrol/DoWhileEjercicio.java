
package estructurascontrol;
import java.util.Scanner;

public class DoWhileEjercicio {
    public static void main(String[] args) {
    
        /*
        int numero = 123456;
        int contador = 0;
       
        do{
            numero = numero / 10;
            contador++; 
        }while(numero > 0);
        
        System.out.println("Digitos: " + contador);

        Ejercicio do while suave  

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int counter = 0;
        
        do {
            
            number = number / 10;
            counter++;
        
        } while (number > 0);
        
        System.out.println("The number has " + counter + " digits");

        Ejercicio do while suave
        
        int reference = 1;
        
        do {
        
            System.out.println(reference);
            reference++;
            
        } while (reference != 101);

        Ejercicio do while medio
        */
        
        Scanner scanner = new Scanner(System.in);
        
        int miles = 1;
        
        do {
            
            System.out.println("Enter the number of miles to convert or '0' to quit: ");
            miles = scanner.nextInt();
            double convertionFactor = 1.6093;
            double kilometers = 0;
            
            if (miles != 0){
            
                kilometers = miles * convertionFactor;
            
                System.out.println("There is/are " + kilometers + " kilometer/s in " + miles + " mile/s" );
                
            } else { 
                
                System.out.println("Good bye");
                
            } 
            
        } while (miles != 0);

    }
}
