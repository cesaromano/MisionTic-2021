package inheritweek3;

public class Bike {

    private String brand;
    private String color;
    private double velocity;
    
    public Bike() {
    
        this.brand = "GW";
        this.color = "red";
        this.velocity = 0;
        
    }
    
    public Bike(String brand, String color, double initialVelocity) {
    
        this.brand = brand;
        this.color = color;
        velocity = initialVelocity;
        
    }
    
    public String getBrand() {
    
        return brand;
        
    }
    
    public void setBrand(String brand) {
    
        this.brand = brand;
        
    }
    
    public String getColor() {
    
        return color;
        
    }
    
    public void setColor(String color) {
    
        this.color = color;
        
    }
    
    public double getVelocity() {
    
        return velocity;
        
    }
    
    public void pedal(double aceleration) {
    
       this.velocity = this.velocity + aceleration; 
        
    }
    
    public void stop() {
    
        if (this.velocity > 0) {
        
            this.velocity--;
            
        }
        
    }
    
    public void stop(double negativeAceleration) {
    
        if (this.velocity > negativeAceleration) {
        
            this.velocity = this.velocity - negativeAceleration;
            
        }
        
    }
    
    public void stop(String intensity) {
    
        if (intensity.equals("fuerte")) {
        
            if (this.velocity > 10) {
            
                this.velocity = this.velocity - 10;
                
            }
            
        } else {
        
            if (this.velocity > 0) {
            
                this.velocity--;
                
            }
        
        }
        
    }
    
}