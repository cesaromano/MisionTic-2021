package abstracclasses;

public class Square extends Figure{

    //Attributes
    private double side;
    
    //Constructor
    public Square(){
        this.side = 0;
    }
    
    public Square(double side){
        this.side = side;
    }
    
    //Methods    
    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }
    
    //Getter and setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    
}
