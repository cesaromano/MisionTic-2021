package estructurascontrol;
import java.util.Scanner;

public class WhileEjercicio {
    public static void main(String[] args) {
        
        /*
        //Ejemplo
        int contador = 1;
        //no hacer bucles infinitos
        while (contador < 10){
        System.out.println("Hola mundo");
        }
        
        
        while (contador < 10){
            System.out.println("Hola mundo: " + contador);
            //Opcion 1
            contador++;
            //Opcion2
            //contador += 1;
            //Opcion 3
            //contador = contador +1;
            
        }
        
        Ejercicio while suave

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int counter = 0;
        
        while (number > 0){
            
            number = number / 10;
            counter++;
        
        }
        
        System.out.println("The number has " + counter + " digits");

        Ejercicio while medio

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or '0' to quit: ");
        int number = scanner.nextInt();
        
        while (number != 0){
            
            if (number % 2 == 0){
                
                System.out.println("Even");
                
                if (number > 0){
                
                    System.out.print(" positive");
                    
                } else {
                
                    System.out.print(" negative");
                
                }
            
            } else {
            
                System.out.println("Odd");
                
                if (number > 0){
                
                    System.out.print(" positive");
                    
                } else {
                
                    System.out.print(" negative");
                
                }
                
            }
            
            number = 0;
        
        }

        Ejercicio while suave        
        
        int reference = 100;
        
        while (reference != 0){
            
            System.out.println(reference);
            reference--;
        
        }

        Ejercicio switch alto - opcional
        
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        long reference1 = 1;
        int counter = 1;
        
        while (counter != number + 1){
        
            reference1 = reference1 * counter;
            counter++;
            
        }
        
        System.out.println("Factorial of " + number + " is " + reference1);



    }
}
