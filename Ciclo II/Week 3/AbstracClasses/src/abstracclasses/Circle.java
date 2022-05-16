package abstracclasses;

public class Circle extends Figure{
    
    //Attributes
    private double radio;
    
    //Constructor
    public Circle(){
        this.radio = 0;
    }
    
    public Circle(double radio){
        this.radio = this.radio;
    }
    
    //Methods
    @Override
    public double getArea() {
        return Math.PI * this.radio * this.radio;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radio;
    }
    
    //Getter and setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
