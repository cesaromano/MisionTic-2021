package arraylist_2;

public class Persona {
    
    //Attributes
    private String nombre;
    private int edad;
    private String telefono;

    //Constructor
    public Persona(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    //Methods
    public String mostrarDatosPersona(){
        return "La persona es: " + this.nombre + ", tiene: " + this.edad + " años, y su telefono es: " + this.telefono;
    }

    //Getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
