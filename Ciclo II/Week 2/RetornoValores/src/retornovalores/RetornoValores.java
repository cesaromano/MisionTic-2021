package retornovalores;

public class RetornoValores {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        
        triangulo.altura = 20;
        triangulo.base = 20;
        
        float resultado = triangulo.area();
        System.out.println(resultado);
    }
    
}

class Triangulo{

    float base;
    float altura;
    
    /*
    void area() {
    
        // no se pueden retornar cosas en el metodo void
        
        float resultado = (this.base * this.altura)/2;
    }
    */

    float area() {
    
        // no se pueden retornar cosas en el metodo void
        
        float resultado = (this.base * this.altura)/2;
        return resultado;

    }
        
}