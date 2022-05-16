package ejemplo_2;


public class Ejemplo_2 {

public static void main(String[] args) {
    
        // 1. object declaration
    
        //Bicicleta bike_1;
        //Student student_1;
        
        // 2. object instantiation
        
        //bike_1 = new Bicicleta();
        //student_1 = new Student("Romano", "Delgado", 25, 4.5);
        
        // declarating and instantiating an objec at the same time

        Bicicleta bike_1 = new Bicicleta();
        Student student_1 = new Student("Romano", "Delgado", 25, 4.5);
        
        // 3. accesing members
        
        System.out.println(bike_1.getBrand());
        bike_1.setBrand("barbie");
        System.out.println("The brand of my bike is: " + '"' + bike_1.getBrand() + '"');
        System.out.println("Initial velocity: " + bike_1.getVelocity());
        bike_1.pedal(5);
        bike_1.pedal(2);
        System.out.println("Actual velocity: " + bike_1.getVelocity());
        bike_1.stop(6);
        System.out.println("Actual velocity: " + bike_1.getVelocity());
        bike_1.stop();
        System.out.println("Actual velocity: " + bike_1.getVelocity());        
        System.out.println("My name is " + student_1.getName() + " " + student_1.getLastName());
        System.out.println(student_1.getAge()); 
        System.out.println("Average: " + student_1.getAverage());
        student_1.setAvrage(5.0);
        System.out.println("New average: " + student_1.getAverage());
        
    }
    
}
