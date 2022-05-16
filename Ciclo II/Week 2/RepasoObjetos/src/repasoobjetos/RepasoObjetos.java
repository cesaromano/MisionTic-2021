package repasoobjetos;

import datos.Usuario; //importation of the package

public class RepasoObjetos {


    
    public static void main(String[] args) {
        
        Usuario user = new Usuario();
        user.username = "Spiderman";
        //user.password = "12345";
        //user.setPassword("12345");

        System.out.println(user.username);
        //System.out.println(user.password);
        System.out.println(user.getPassword());
        System.out.println(user);
        
        Usuario batman = new Usuario("Batman");
        System.out.println(batman.username);
        System.out.println(batman.getPassword());
        System.out.println(batman);
        
        user = batman; // this is an usual error, because the memory
        // asignation is the same
        user.username = batman.username;
        System.out.println("Variable usuario: " + user.username);
        batman.username = "Bruce Wayne";
        System.out.println("Variable batman: " + user.username);
        System.out.println(batman);
        System.out.println("Variable usuario: " + user.username);
        
        
        
    }
    
}
