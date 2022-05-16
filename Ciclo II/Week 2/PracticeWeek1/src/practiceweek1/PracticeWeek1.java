package practiceweek2;
import java.util.Scanner;

public class PracticeWeek2 {

    public static void main(String[] args) {
        
        /*
        Exercise 1
        
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long reference1 = 1;
        int counter = 1;
        
        while (counter != number + 1) {
            
            reference1 = reference1 * counter;
            //reference1 *= counter;
            counter++;
            
        }
        
        System.out.println(reference1);
        
        
        Exercise 2     
        
        int [] vector = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        int s = 0;
        int reference1 = 0;
        
        for (int index = 0; index <= vector.length - 1; index++) {
            
            int reference2 = vector[index];
            
            if (reference2 > 0) {
                
                if (reference2 % 2 == 0) {
                    
                    s = reference2 + s;
                    reference1++;
                    
                }
                
            }
            
        }
        
        System.out.println(s);


        Exercise 3 
               
        int [] vector = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        int sum = 0;
        float reference1 = 0;
        
        for (int index = 0; index <= vector.length - 1; index++) {
            
            int reference2 = vector[index];
            sum = reference2 + sum;
            reference1++;
            
        }
        
        double promedio = sum / reference1;
        
        System.out.println(promedio);

        Exercise 4

        // Teachers' example
        
        int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int [] vectorEntradaOrdenado = new int[vectorEntrada.length];
        
        for (int index1 = 0; index1 < (vectorEntrada.length / 2); index1++){
        
            for (int index2 = 1; index2 < (vectorEntrada.length / 2); index2++){
            
                int backPosition = vectorEntrada[index2 - 1];
                int currentPosition = vectorEntrada[index2];
                
                if(currentPosition < backPosition){
                
                    //int reference1 = ;
                    vectorEntrada[index2 -1] = currentPosition;
                    vectorEntrada[index2] = backPosition;   
                    
                }

            }
            
            vectorEntradaOrdenado[index1] = vectorEntrada[index1];
            
            //System.out.println(vectorEntradaOrdenado[index1]);
            
        } 
        
        //78, 12, 11, 90, 13
        
        for (int index1 = vectorEntrada.length / 2; index1 < vectorEntrada.length; index1++){
        
            for (int index2 = ((vectorEntrada.length / 2) + 1); index2 < vectorEntrada.length; index2++){
            
                int backPosition = vectorEntrada[index2 - 1];
                int currentPosition = vectorEntrada[index2];
                
                if(currentPosition > backPosition){
                
                    //int reference1 = ;
                    vectorEntrada[index2 -1] = currentPosition;
                    vectorEntrada[index2] = backPosition;   
                    
                }

            }
            
            vectorEntradaOrdenado[index1] = vectorEntrada[index1];  
            
        }   
        
        // example extracted from https://stackabuse.com/sorting-algorithms-in-java
        
        
        
        int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int [] vectorEntradaOrdenado = new int[vectorEntrada.length];
        boolean sorted = false;
        
        while(sorted == false) {
            
            // left half
            sorted = true;
            for (int index = 0; index < (vectorEntrada.length / 2) - 1; index++) {
                
                if (vectorEntrada[index] > vectorEntrada[index+1]) {
                    
                    int temp = vectorEntrada[index];
                    vectorEntrada[index] = vectorEntrada[index+1];
                    vectorEntrada[index+1] = temp;
                    sorted = false;
                }
                
            }
            
            // right half
            sorted = true;
            for (int index = (vectorEntrada.length / 2); index < vectorEntrada.length - 1; index++) {
                
                if (vectorEntrada[index] < vectorEntrada[index+1]) {
                    
                    int temp = vectorEntrada[index];
                    vectorEntrada[index] = vectorEntrada[index+1];
                    vectorEntrada[index+1] = temp;
                    sorted = false;
                }
                
            }
            
        }
        
        for (int index = 0; index < vectorEntrada.length; index++){
            
            vectorEntradaOrdenado[index] = vectorEntrada[index];
            System.out.println(vectorEntradaOrdenado[index]);
            
        }
        
       
        
        Exerise 5

        int [] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int [] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
        int [] s = new int[v1.length];
        int sum = 0;
        
        for (int index = 0; index <= v1.length - 1; index++) {
            
            sum = v1[index] + v2[index];
            s[index] = sum;
            
            System.out.println(s[index]);
            
        }
        
        Exercise 6
        
        */
        
        char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};
        String vectorConcatenado = "";
        
        for (int index = 0; index < vector.length -1; index++){
        
            vectorConcatenado += vector[index];
            
        }
        
        System.out.println(vectorConcatenado);
       
    }
    
}