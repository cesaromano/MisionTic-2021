package challenge4version3;

import java.util.ArrayList;
import java.util.Iterator;
public class Condominio {
    
    //Inserte acá los atributos

    private ArrayList <Inmueble> inmuebles = new ArrayList<>();
    
    //Inserte acá el método constructor
    
    public Condominio() {
    }

    //Inserte acá los SETTERS Y GETTERS

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public void agregarInmueble(Inmueble i/*Es el inmueble por agregar a la lista
                                inmuebles*/){
        /*Agrega el inmueble recibido como parámetro a la lista inmuebles si este 
        NO está en la lista (Dos inmuebles son diferentes si sus ID son diferentes)*/
        
        Iterator <Inmueble>  iterador = inmuebles.iterator();
        
        Integer referencia = 0;
        while(iterador.hasNext()){
            
            Inmueble inmueble = iterador.next();
            if(inmueble.getIDArrendador().equalsIgnoreCase(i.getIDArrendador())){
                referencia += 1; 
            }
        }
        if(referencia == 0){
            inmuebles.add(i);
        }
    }
    
    public void eliminarInmueble(String ID/*Número del inmueble a eliminar de la
                                lista inmuebles*/){
        /*Elimina el inmueble con nCasa igual al recibido por parámetro (ID)*/
        Iterator <Inmueble>  iterador = inmuebles.iterator();
        
        while(iterador.hasNext()){
            
            Inmueble inmueble = iterador.next();
            if(inmueble.getnCasa().equalsIgnoreCase(ID)){
                iterador.remove();
                }
            }
    }
    
    public double calcularArriendoMensualCondominio(){
        /*Retorna la suma de los arriendos mensuales de todas las casas que hay en
        inmuebles*/
        Iterator <Inmueble>  iterador = inmuebles.iterator();
        
        double sumatoriaArriendos = 0.0;
        
        while(iterador.hasNext()){
            Inmueble inmueble = iterador.next();
            sumatoriaArriendos += inmueble.getCostoMensual();            
            }
        
        return sumatoriaArriendos;
    }
    
    public double promedioCostoInmueble(){
        /*Retorna el promedio del costo de arriendo de todos los inmuebles*/
        Iterator <Inmueble>  iterador = inmuebles.iterator();
        
        double arriendos = 0.0;
        int numeroInmuebles = 0;
        
        while(iterador.hasNext()){
            Inmueble inmueble = iterador.next();
            arriendos += inmueble.getCostoMensual();
            numeroInmuebles += 1;
            }
        
        return arriendos / inmuebles.size();
    }
    
    public double desviacionEstandarCostoInmueble(){
        /*Retorna la desviación estándar del costo de arriendo de todos los
        inmuebles*/
        Iterator <Inmueble>  iterador = inmuebles.iterator();
        
        double arriendos = 0.0;
        double promedio = 0.0;
        
        while(iterador.hasNext()){
            Inmueble inmueble = iterador.next();
            arriendos += inmueble.getCostoMensual();
            }
        
        promedio = Math.round(arriendos / inmuebles.size());
        
        Iterator <Inmueble>  iterador2 = inmuebles.iterator();
        
        double sumatorias = 0.0;
        
        while(iterador2.hasNext()){
            Inmueble inmueble = iterador2.next();
            double result = Math.pow(inmueble.getCostoMensual() - promedio, 2);
            sumatorias += result;
            }
        
        double varianza = sumatorias / inmuebles.size();

        return (Math.sqrt(varianza));
    }

}
