package calculadora;

public class Main {
    
    public static void main(String[] args){
        
    // add
    // 
    
    Calculadora calculator = new Calculadora();
    float result = calculator.add(2, 1);
    System.out.println("Integer addition: " + result);
    
    double result1 = calculator.add(2.9, 1.8);
    System.out.println("Double addition: " + result1);
    
    result = calculator.add(2, 1, 3, 4, 5, 6);
    System.out.println("Multiple parametter addition: " + result);
    
    
    
    }
}
