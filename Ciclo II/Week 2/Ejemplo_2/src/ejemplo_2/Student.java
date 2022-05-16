package ejemplo_2;

public class Student {
    
    private String name;
    private String lastName;
    private int age;
    private double average;
    
    public Student() {
    
        this.name = "";
        this.lastName = "";
        this.age = 0;
        this.average = 0.0;
        
    }
    
    public Student(String name, String lastName, int age, double average) {
    
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.average = average;
        
        
    }
  
    public String getName() {
    
        return name;
        
    } 
    
    public void setName(String name) {
    
        this.name = name;
        
    }
    
    public String getLastName() {
    
        return lastName;
        
    }
    
    public void setLastName(String lastName) {
    
        this.lastName = lastName;
        
    }
    
    public int getAge() {
    
        return age;
        
    }
    
    public void setAge(int age) {
    
        this.age = age;
        
    }
    
    public double getAverage() {
    
        return average;
        
    }
    
    public void setAvrage(double average){
    
        this.average = average;
        
    }
    
}
