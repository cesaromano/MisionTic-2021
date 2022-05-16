
package estructurascontrol;
import java.util.Scanner;

public class SwitchEjemplo {
    public static void main(String[] args) {
    
        /*
        int numeroDia = 4;
        switch (numeroDia){
            case 1:
                System.out.println("Lunes");
                
            case 2:
                System.out.println("Martes");
                
            case 3:
                System.out.println("Miercoles");
                
            case 4:
                System.out.println("Jueves");
                
            case 5:
                System.out.println("Viernes");
                
            case 6:
                System.out.println("Sabado");
            
            case 7:
                System.out.println("Domingo");
            
            default://se considera como el else del if
                System.out.println("No existe el dia");
            
        }
        
        Ejercicio Switch suave
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert month's number: ");
        int mes = scanner.nextInt();
        
        switch (mes) {
        
            case 2:
                System.out.println("This month has 28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days");
                break;
                
            default:
                System.out.println("Insert a valid number please");
            
        }

        Ejercicio Switch suave
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark: ");
        String mark = scanner.next();
        
        switch (mark) {
        
            case "a":
                System.out.println("Excelent");
                break;
            case "b":
            case "c":
                System.out.println("Well done");
                break;
            case "d":
                System.out.println("Passed");
                break;
            case "e":
                System.out.println("It would be better");
                break;
                
            default:
                System.out.println("Invalid mark");
            
        }

        Ejercicio Switch medio
        
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month's number: ");
        int mes = scanner.nextInt();
        
        switch (mes) {
        
            case 2:
                System.out.println("February has 28 days");
                break;
            case 4:
                System.out.println("April has 30 days");
                break;
            case 6:
                System.out.println("June has 30 days");
                break;
            case 9:
                System.out.println("September has 30 days");
                break;
            case 11:
                System.out.println("November has 30 days");
                break;
            case 1:
                System.out.println("January has 31 days");
                break;
            case 3:
                System.out.println("March has 31 days");
                break;
            case 5:
                System.out.println("May has 31 days");
                break;
            case 7:
                System.out.println("July has 31 days");
                break;
            case 8:
                System.out.println("August has 31 days");
                break;
            case 10:
                System.out.println("October has 31 days");
                break;
            case 12:
                System.out.println("December has 31 days");
                break;
                
            default:
                System.out.println("Insert a valid number please");
            
        }
        
    }
}
