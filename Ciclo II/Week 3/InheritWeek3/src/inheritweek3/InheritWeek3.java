package inheritweek3;

public class InheritWeek3 {

    public static void main(String[] args) {
        
        //Creating MountainBike object
        MountainBike mb1 = new MountainBike();
        
        //Printing some methods and attributes
        System.out.println("The brand of my bike is: " + mb1.getBrand()
                + ", his color is " + mb1.getColor()
                + ", has a velocity of " + mb1.getVelocity()
                + " and is in the shift " + mb1.getShift()
        );
        
        // setting attributes and using methods
        mb1.setBrand("Monster");
        mb1.setColor("Blue");
        mb1.upShift();
        mb1.upShift();
        mb1.upShift();
        mb1.pedal(5);
        mb1.pedal(5);
        
        //Printing some methods and attributes
        System.out.println("The brand of my bike is: " + mb1.getBrand()
                + ", his color is " + mb1.getColor()
                + ", has a velocity of " + mb1.getVelocity()
                + " and is in the shift " + mb1.getShift()
        );
    }
    
}
