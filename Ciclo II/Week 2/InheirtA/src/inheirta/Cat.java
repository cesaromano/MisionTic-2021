package inheirta;

public class Cat extends Pet{
    /*
    public Cat(String name, String race, int age) {
        super(name, race, age);
    }
    */
    
    @Override //Guide to know that it method 
    //is overriding
    public void sleep(){
        super.drink();
        System.out.println("The cat is sleeping");
    }
}
