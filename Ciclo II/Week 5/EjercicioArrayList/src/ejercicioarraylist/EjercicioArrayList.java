package ejercicioarraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList {

    static Scanner scanner;
    static ArrayList<Contacto> contactos;
    
    public static void main(String[] args) {
        
        scanner = new Scanner(System.in);
        contactos = new ArrayList<>();
        int opcion;
        do{
            menu();
            opcion = scanner.nextInt();
            
            switch(opcion){
            
                case 1:
                    mostrarContactos();
                    break;
                case 2:
                    añadirContacto();
                    break;
                case 3:
                    eliminarContacto();
                    break;
                case 4:
                    eliminarTodosContactos();
                    break;
                case 5:
                    buscarContacto();
                    break;    
                default:
                    System.out.println("Opcion incorrecta, ingresa"
                            + "opcion valida");
                
                
            }
            
        }while (opcion != 0);
        scanner.close();
      
    }
    
    public static void menu(){
        System.out.println("Agenda de contactos");
        System.out.println("1. Mostrat todos los contactos");
        System.out.println("2. Añadir un contacto");
        System.out.println("3. Eliminar un contacto");
        System.out.println("4. Eliminar todos los contactos");
        System.out.println("5. Buscar un contacto");
        System.out.println("0. Salir del programa");
        
        System.out.println("Elije una opcion");
    }

    private static void mostrarContactos() {
        if(contactos.isEmpty()){
            System.out.println("La agenda no tiene contactos");
        }else{
            for (int i = 0; i < contactos.size(); i++) {
                Contacto contacto = contactos.get(i);
                System.out.printf("%d - nombre: %s, telefono: %s", i+1, contacto.getNombre(), contacto.getTelefono());
            }
        }
        System.out.println();
    }

    private static void añadirContacto() {
        System.out.println("Añadir contacto");
        System.out.println("Ingresar un nombre: ");
        String nombre = scanner.next();
        System.out.println("Ingresar un telefono: ");
        String telefono = scanner.next();
        contactos.add(new Contacto(nombre, telefono));
        System.out.println();
    }

    private static void eliminarContacto() {
        System.out.println("Eliminar contacto");
        System.out.println("Ingresar posicion");
        int posicion = scanner.nextInt();
        
        if(posicion < 0 || posicion >= contactos.size()){
            System.out.println("Posicion incorrecta");
            
        }else{
            System.out.println("Esta seguro de eliminnar el contacto?, Si => S, NO => N");
            String confirmar = scanner.next();
            if(confirmar.equalsIgnoreCase("s")){
                contactos.remove(posicion);//es posible por que no esta en un iterador
            }
        }
    }

    private static void eliminarTodosContactos() {
        System.out.println("Eliminar odos los contactos");
        System.out.println("Esta seguro de eliminnar el contacto?, Si => S, NO => N");
        String confirmar = scanner.next();
            if(confirmar.equalsIgnoreCase("s")){
                contactos.clear();//es posible por que no esta en un iterador
            }
    }

    private static void buscarContacto() {
        System.out.println("Buscar un contacto");
        System.out.println("Ingresa el nombre: ");
        String nombre = scanner.next();
        Contacto contacto = null;
        for(Contacto c : contactos){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                contacto = c;
                break;
            }
        }
        System.out.println(contacto);
        
    }
    
}
