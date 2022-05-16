package datos;

public class Usuario {
    
    public String username; //Atributes
    private String password; 
    
    // Constructors -- constructor overload
    // Constructor by default, void or null
    public Usuario(){
    
        System.out.println("Creation of a new object");
        
    }
    // constructor with parameters
    public Usuario(String username, String password){
    
        this.username = username;
        this.password = password;
        
    }
    
    public Usuario(String username){
    
        this.username = username;
        this.password = "0000";
        this.Greet();
    }
    
    // default
    // public
    // private
    // protected
    
    public void Greet(){
    
        System.out.println("Hello, my username is: " + username);
        
    }
    
    // Getter and Setter
    
    // Setter, modify attributes
    public void setPassword(String pass){
    
        this.password = pass;
        
    }
    
    // Getter
    public String getPassword(){
    
        return this.password;
        
    }
    
}
