
package estructurascontrol;
import java.util.Scanner;

public class EstructurasControl {


    public static void main(String[] args) {
      
        /*
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la hora");
        int hora = scanner.nextInt();
        if(hora < 12) {
            System.out.println("Es por la mañana");
        }else if(hora < 15){
            System.out.println("Es por la tarde");
        }else{
            System.out.println("Es por la noche");
        }

        Ejercicio 1
        
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la primera nota: ");
        int notaUno = scanner.nextInt();
        
        System.out.println("Escribe la segunda nota: ");
        int notaDos = scanner.nextInt();
        
        int resultado = notaUno + notaDos;
        if(resultado >= 7){//Ejercicio 1
            System.out.println("Aprobo");
        }else {//Ejercicio 2
            System.out.println("Reprobo");
        }
        
        //If ternario
        System.out.println("Escribe la hora");
        int hora = scanner.nextInt();
        String horario = hora < 12 ? "Es por la mañana" : "Es por la noche";
            System.out.println("El horario es: " + horario);
        
        SWITCH
        
        Ejercicio If suave
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la primera nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Escribe la segunda nota: ");
        int nota2 = scanner.nextInt();
        
        if ((nota1 + nota2)>= 7){
        System.out.println("Aprueba");
        }

        Ejercicio If medio
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la primera nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Escribe la segunda nota: ");
        int nota2 = scanner.nextInt();
        
        if ((nota1 + nota2)>= 7){
        System.out.println("Aprueba");
        } else {
        System.out.println("Perdio");
        }

        Ejercicio If medio
        
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la primera nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Escribe la segunda nota: ");
        int nota2 = scanner.nextInt();
        
        if ((nota1 + nota2)>= 7){
        System.out.println("Aprueba");
        } else {
            if((nota1 + nota2)<= 7 && (nota1 + nota2)>= 5){
            System.out.println("Supletorio");
            } else {
            System.out.println("Perdio");
            }
        }
        
    }
    
}
