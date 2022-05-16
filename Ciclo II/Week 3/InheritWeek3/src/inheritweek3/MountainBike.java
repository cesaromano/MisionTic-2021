package inheritweek3;

public class MountainBike extends Bike{
    
    private int shift;
    
    //Bike constructor
    public MountainBike(){
        super();
        this.shift = 6;
    }
    //MountainBike constructor
    public MountainBike(String brand, String color, double initialVelocity) {
        super(brand, color, initialVelocity);
        if(shift > 0 && shift <= 12){
            this.shift = shift;
        }else{
            this.shift = 6;
        }
    }
    
    
    
    public void upShift(){
        if(this.shift < 12){
            shift++;
        } 
    }   
        
    public void downShift(){
        if(this.shift > 1){
            shift--;
        }
    }
  
    @Override
    public void pedal(double aceleration) {
        double acelerationShifted = aceleration * (this.shift/6);
        super.pedal(acelerationShifted);       
    }

    public int getShift() {
        return this.shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
    
}
