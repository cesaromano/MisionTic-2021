package inheirta;

public class Pet {
    
    public String name;
    public String race;
    public int age;
    
    /*
    public Pet(String name, String race, int age) {
    this.name = name;
    this.race = race;
    this.age = age;
    
    }
    */
    
    
    public void sleep(){
    
        System.out.println("The cat is sleeping");
        
    }
    
    public void walk(){
    
        System.out.println("The cat is walking");
        
    }
    
    public void eat(){
    
        System.out.println("The cat is eating");
        
    }
    
    public void drink(){
    
        System.out.println("The cat is drinking");
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }
    
}