package statics;

public class Circle {
    
    public static final /* Hhace la variable constante*/ float pi = 3.141592f; // Le pertenece a la clase y no al objeto
    public float radius = 0;// Le pertenece al objeto

    public Circle(float radius) {
    
        this.radius = radius;
        
    }
    
    
    
    public static float area(float radius){
    
       return pi * (radius * radius); 
        
    }
    
}
