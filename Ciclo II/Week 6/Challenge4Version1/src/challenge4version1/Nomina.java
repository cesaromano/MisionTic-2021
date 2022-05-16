package challenge4version1;

import java.util.ArrayList;
import java.util.Iterator;

public class Nomina {
    
    //Attributes
    
    private ArrayList <Trabajador> trabajadores = new ArrayList<>();
    
    //Constructor

    public Nomina() {
    }
    
    //Setters y Getters

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    //Methods
    
    public void agregarTrabajador(Trabajador t){
        Iterator <Trabajador>  iterador = trabajadores.iterator();
        
        Integer referencia = 0;
        while(iterador.hasNext()){
            
            Trabajador trabajador = iterador.next();
            if(trabajador.getCC().equalsIgnoreCase(t.getCC())){
                referencia += 1; 
            }
        }
        if(referencia == 0){
            trabajadores.add(t);
        }
    }
    
    public void eliminarTrabajador(String ID){
        Iterator <Trabajador>  iterador = trabajadores.iterator();
        
        while(iterador.hasNext()){
            
            Trabajador trabajador = iterador.next();
            if(trabajador.getCC().equalsIgnoreCase(ID)){
                iterador.remove();
                }
            }
    }
    
    public double calcularSalarioQuincenalNomina(){
        
        Iterator <Trabajador>  iterador = trabajadores.iterator();
        
        double sumatoriaSalario = 0.0;
        
        while(iterador.hasNext()){
            
            Trabajador trabajador = iterador.next();
            
            sumatoriaSalario += trabajador.salarioQuincenal();
            
            }
        
        return sumatoriaSalario;
    }
    
    public double promedioEdadNomina(){
        
        Iterator <Trabajador>  iterador = trabajadores.iterator();
        
        double edades = 0.0;
        
        while(iterador.hasNext()){
            Trabajador trabajador = iterador.next();
            edades += trabajador.calcularEdad();
            }
        
        return edades / trabajadores.size();
    }
    
    public double desviacionEstandarEdadNomina(){
        
        Iterator <Trabajador>  iterador = trabajadores.iterator();
        
        double edades = 0.0;
        double promedio = 0.0;
        
        while(iterador.hasNext()){
            Trabajador trabajador = iterador.next();
            edades += trabajador.calcularEdad();
            } 
        
        promedio = edades / trabajadores.size();
        
        Iterator <Trabajador>  iterador2 = trabajadores.iterator();
        
        double sumatorias = 0.0;
        
        while(iterador2.hasNext()){
            Trabajador trabajador = iterador2.next();
            double result = Math.pow(trabajador.calcularEdad() - promedio, 2);
            sumatorias += result;
            }
        
        double varianza = sumatorias / trabajadores.size();

        return (Math.sqrt(varianza));
    
    }
    
    public double salarioQuincenalTrabajador(){
        return 0.0;
    }
    
}
