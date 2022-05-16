
package estructurascontrol;
import java.util.Scanner;

public class ArreglosEjemplos {
    public static void main(String[] args) {
        
        /*
        //Ejemplo
        Scanner scanner = new Scanner(System.in);
        int tamaño = scanner.nextInt();
        int [] datos = new int[tamaño];
        datos[0] = 10;
        
        System.out.println(datos[0]);
        
        //Recorrer areglos
        for(int indice = 0; indice <= datos.length - 1; indice++){
            System.out.println(datos[indice]);
        }
        
        int [] numero = {1,5,6,7,8};

        Ejercicio array suave
        
        
        
        int [] array = new int[21];
        
        for (int index = 0, x = 0; x <= array.length - 1;){
            
            if (index % 2 == 0) {
    
            array[x] = index;
            
            x++;

            }
           
        index++;

        }
        
        for (int x = 0; x <= array.length -1; x++) {
        
            System.out.println(array[x]);
           
        }

        Ejercicio array suave
        
        String [] arrayName = {"", "romano", "rosalba", "victor", "sergio", "nicoll"};
        
        String [] arrayLastName = {"", "delgado", "marin", "garcia", "garcia", "jerez"};
        
        for (int index = 1; index <= arrayName.length -1; index++){
        
            System.out.println(arrayName[index] + " " + arrayLastName[index]);
            
        }
        
        
        
        int [] marks= {9,8,7,10,10,9,8,8,10,9};
        double sum = 0;
        float marksNumber = 0;
        
        for (int index = 0; index <= marks.length -1; index++){
        
            int reference = marks[index];
            sum = reference + sum; 
            marksNumber++;            
            
        }
        
        System.out.println("The average is: " + (sum / marksNumber));

        
        
        int [] marks= {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        long sum = 0;
        int marksNumber = 0;
        
        for (int index = 0; index <= marks.length -1; index++){
        
            int reference = marks[index];
            
            if (reference > 0) {
                
                if (reference % 2 == 0) {
                
                sum = reference + sum; 
                marksNumber++;  
                    
                }
 
            }
            
        }
        
        System.out.println(sum);

        */
        
        int [] marks= {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        double sum = 0;
        float marksNumber = 0;
        
        for (int index = 0; index <= marks.length -1; index++){
        
            int reference = marks[index];
            sum = reference + sum; 
            marksNumber++;            
            
        }
        
        double promedio = (sum / marksNumber);
        
        System.out.println(promedio);


    }
 
}
