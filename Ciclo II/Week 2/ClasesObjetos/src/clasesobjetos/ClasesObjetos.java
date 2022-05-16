package clasesobjetos;

public class ClasesObjetos {

    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.establecerAtributos("Mazda", "CX30", 5, 4);
        
        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.numeroPuertas);
        System.out.println(carro.numeroRuedas);
        
        carro.encender();
    }
    
}
