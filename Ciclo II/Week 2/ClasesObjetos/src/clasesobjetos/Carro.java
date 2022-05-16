package clasesobjetos;


public class Carro {
    
    // Atributos
    
    String marca;
    String modelo;
    int numeroPuertas;
    int numeroRuedas;
    
    // Metodos
    
    void establecerAtributos(String marca, 
                             String modelo, 
                             int numeroPuertas, 
                             int numeroRuedas) {
    
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
    
    }
    
    void encender(){
    
        System.out.println("Carro encendido");
        
    }
    
    void andar(){
    
        System.out.println("Carro andando");
        
    }
    
    void frenar(){
    
        System.out.println("Frenar carro");
        
    }
    
    void apagar(){
    
        System.out.println("Apagar carro");
        
    }
    
}
