package modificadoresacceso;

class Usuario {
    
    String username;
    private String password;
    
// Modificadores Default
// Modificadores private
// Modificadores public
// Modificadores protected
    
    
    
void saludar(){

    System.out.println("Hola, mi usuario es: " + this.username);
    
}

// Getters and Setters

// Getter - Obtener el valor del atributo

public String getPassword () {

    return this.password;
    
}

// Setter - Modificar el valor del atributo

public void setPassword (String pass){

    password = pass;
    
}

}
