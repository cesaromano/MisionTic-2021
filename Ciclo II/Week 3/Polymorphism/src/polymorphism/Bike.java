package polymorphism;

public class Bike{
    
    //Attributes
    private String brand;
    private String color;
    private double velocity;
    private String pedals;

    //Constructor
    public Bike() {
        this.brand = "GW";
        this.color = "gris";
        this.velocity = 0;
        this.pedals = "Shimano";
    }

    public Bike(String brand, String color, double velocity, String pedals) {
        this.brand = brand;
        this.color = color;
        this.velocity = velocity;
        this.pedals = pedals;
    }
    
    //Methods
    
    public void pedalear(double aceleration) {
        this.velocity = this.velocity + aceleration;
    }

    public void frenar() {
        if (this.velocity > 0) {
            this.velocity--;
        }
    }

    public String getDescripcion() {
        return "Im a " + brand + " bike, my color is " + color
                + ", my velocity is " + velocity + " and have pedals " + pedals;
    }
    
    //Getter and setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String marca) {
        this.brand = marca;
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

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public String getPedals() {
        return pedals;
    }

    public void setPedals(String pedals) {
        this.pedals = pedals;
    }
    
}
