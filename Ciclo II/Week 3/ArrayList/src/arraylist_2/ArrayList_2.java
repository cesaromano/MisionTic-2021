package arraylist_2;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_2 {
    public static void main(String[] args) {
        //Constructores
        
        /*
        //Java 1.4
        List carros = new ArrayList();
    
        //Java 1.5 y 1.6
        List <String> carros = new ArrayList <String>();
        List carros = new ArrayList <String>();
    
        //Java 1.7
        List <String> carros = new ArrayList<>();
        List carros = new ArrayList<>();
        */
        /*
        
        Persona [] personas = new Persona[3];
        
        personas[0] = new Persona("Romano", 25, "3194979888");
        personas[1] = new Persona("Romano", 25, "3194979888");
        personas[2] = new Persona("Romano", 25, "3194979888");
        */
        ArrayList <Persona> personas = new ArrayList<>();
        
        /*
        //Determina un limite en el vector
        //permitiendo mas entradas 
        numeropersonas.ensureCapacity(15);
        */
        
        personas.add(new Persona("Romano", 25, "3194979888"));
        personas.add(new Persona("Nicoll", 21, "3194979888"));
        personas.add(new Persona("Sergio", 14, "3194979888"));
        personas.add(new Persona("Romano", 25, "3194979888"));
        personas.add(new Persona("Nicoll", 21, "3194979888"));
        personas.add(new Persona("Sergio", 14, "3194979888"));
        personas.add(new Persona("Romano", 25, "3194979888"));
        personas.add(new Persona("Nicoll", 21, "3194979888"));
        personas.add(new Persona("Sergio", 14, "3194979888"));
        personas.add(new Persona("Romano", 25, "3194979888"));
        personas.add(new Persona("Nicoll", 21, "3194979888"));
        personas.add(new Persona("Sergio", 14, "3194979888"));
        personas.add(new Persona("Romano", 25, "3194979888"));
        personas.add(new Persona("Nicoll", 21, "3194979888"));
        personas.add(new Persona("Sergio", 14, "3194979888"));
        
        /*
        //Corta el vector hasta el numero de items que contiene
        personas.trimToSize();
        */
        /*
        for(int index = 0; index < personas.size(); index++){
            Persona persona = personas.get(index);
            System.out.println(persona.mostrarDatosPersona());
        }
        
        for(Persona persona : personas){
            System.out.println(persona.mostrarDatosPersona());
        }
        */
        
        Iterator <Persona>  iterador = personas.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next().mostrarDatosPersona());
        }
        
    }
 
}
