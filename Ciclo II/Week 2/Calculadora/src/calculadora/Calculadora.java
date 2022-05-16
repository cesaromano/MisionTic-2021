package calculadora;

public class Calculadora {

    // method overloading
    
    //return entire number
    public int add(int numberA, int numberB){
    
        int result = numberA + numberB;
        return result;
        
    }
    
    // Addition with float
    public float add(float numberA, float numberB){
    
        return numberA + numberB;
        
    }
    
    // Addition with double
    public double add(double numberA, double numberB){
    
        return numberA + numberB;
        
    }
    
    // Multiple parameters
    public int add(int...numbers){
    
        int add = 0;
        
        /*
        for(int index = 0; index < numbers.length; index++) {
        
            add += numbers[index];
            
        }
        */
        //For each
        for(int number : numbers){
            add += number;
        }
        
        return add;
        
    }
    
}
