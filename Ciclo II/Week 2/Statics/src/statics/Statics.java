package statics;

public class Statics {

    public static void main(String[] args) {
        
        // creation of new instance
        //Circle circle = new Circle(10.5f);
        //System.out.println(circle.area());
    
        // Calling a class attribute
        System.out.println(Circle.pi);
        System.out.println(Circle.area(10.5f));
        
    }
    
}
