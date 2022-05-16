package challenge1version2;

public class Challenge1Version2 {

    public static void main(String[] args) {
        
        SIMCard sc1 = new SIMCard("3194979884");
        
        sc1.recargarSaldo(50000);
        System.out.println(sc1.getSaldo());
        System.out.println(sc1.getSaldoDatos());
        
        sc1.comprarDatos(12);   
        System.out.println(sc1.getSaldo());
        System.out.println(sc1.getSaldoDatos());
        
        sc1.consumirDatos(3);   
        System.out.println(sc1.getSaldo());
        System.out.println(sc1.getSaldoDatos());
        
        sc1.gestionarEncendidoCelular();  
        sc1.llamar(120);
        System.out.println(sc1.getSaldo());
        System.out.println(sc1.getSaldoDatos());
        
        sc1.gestionarModoAvion(); 
        sc1.gestionarDatos();
        System.out.println(sc1.getEmpresaTelefonia());
        System.out.println(sc1.getSaldo());
        System.out.println(sc1.getNumeroTelefono());
        System.out.println(sc1.isCelularApagado());
        System.out.println(sc1.isModoAvionActivado());
        System.out.println(sc1.isDatosActivados());
        System.out.println(sc1.getSaldoDatos());
        
        sc1.gestionarModoAvion(); 
        sc1.gestionarDatos();
        System.out.println(sc1.getEmpresaTelefonia());
        System.out.println(sc1.getSaldo());
        System.out.println(sc1.getNumeroTelefono());
        System.out.println(sc1.isCelularApagado());
        System.out.println(sc1.isModoAvionActivado());
        System.out.println(sc1.isDatosActivados());
        System.out.println(sc1.getSaldoDatos());
        
        sc1.consumirDatos(3);
        System.out.println(sc1.getEmpresaTelefonia());
        System.out.println(sc1.getSaldo());
        System.out.println(sc1.getNumeroTelefono());
        System.out.println(sc1.isCelularApagado());
        System.out.println(sc1.isModoAvionActivado());
        System.out.println(sc1.isDatosActivados());
        System.out.println(sc1.getSaldoDatos());
        
        sc1.gestionarEncendidoCelular();
        System.out.println(sc1.getEmpresaTelefonia());
        System.out.println(sc1.getSaldo());
        System.out.println(sc1.getNumeroTelefono());
        System.out.println(sc1.isCelularApagado());
        System.out.println(sc1.isModoAvionActivado());
        System.out.println(sc1.isDatosActivados());
        System.out.println(sc1.getSaldoDatos());
        
        
        //System.out.println(sc1.getNumeroTelefono());      
        
    }
    
}
