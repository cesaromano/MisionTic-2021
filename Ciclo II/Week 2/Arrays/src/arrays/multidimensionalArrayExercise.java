package arrays;
import java.awt.BorderLayout;
import java.util.Scanner;

public class multidimensionalArrayExercise {
   // Create a program wich receive 
   // ten numbers and shows odd numbers
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[10];
        int [] odds = new int[10];
        
        System.out.println("Insert ten numbers: ");
        int counter = 0;
        for (int index = 0; index < 10; index++) {
            numbers[index] = scanner.nextInt();
            
            if(numbers[index]  % 2 == 0){
            
                odds[counter] = numbers[index];
                counter++;
            }
            
        }
        
        System.out.println("Odds numbers are: ");
        for(int index = 0; index < counter; index++){
        
            System.out.println(odds[index]);
            
        }
    }
}
