package arraylist;
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        
        ArrayList <Integer> numbers = new ArrayList <Integer>();
        
        numbers.add(8);
        numbers.add(427);
        numbers.add(-75);      
        
        //Knowing the size of the vector
        System.out.println(numbers.size());
        //Knowing the value of the item
        System.out.println(numbers.get(1));
        //Removing items in a vector
        numbers.remove(2);
        System.out.println(numbers.size());
        //Clearing all elements in  vector
        numbers.clear();
        System.out.println(numbers.size());
        //
        
    }
    
}
