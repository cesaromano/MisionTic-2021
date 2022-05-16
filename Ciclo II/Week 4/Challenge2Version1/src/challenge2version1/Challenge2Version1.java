package challenge2version1;

public class Challenge2Version1 {

    public static void main(String[] args) {
        
        /*
        Jugador j = new Jugador("Explorador", 'm', 0, 5, 100);
        Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);
        
        //1. Se comienza la partida
        
        System.out.println("Jugador");
        System.out.println("Nombre: " + j.getNombre());
        System.out.println("Sexo: " + j.getSexo());
        System.out.println("Posicion x: " + j.getPosicionX());
        System.out.println("Posicion y: " + j.getPosicionY());
        System.out.println("Damage: " + j.getDamage());
        System.out.println("Vida: " + j.getVida());
        System.out.println("Numero botiquines: " + j.getNumeroBotiquines());
        
        System.out.println("");
        
        System.out.println("Jugador");
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Sexo: " + e.getSexo());
        System.out.println("Posicion x: " + e.getPosicionX());
        System.out.println("Posicion y: " + e.getPosicionY());
        System.out.println("Damage: " + e.getDamage());
        System.out.println("Vida: " + e.getVida());
        System.out.println("Numero botiquines: " + e.getEvolucionesAplicadas());
        System.out.println("Numero botiquines: " + e.getResistencia());
        
        //2
        
        j.golpear(e);
        j.golpear(e);
        j.moverDerecha(10);
        j.moverAbajo(5);
        
        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();
        
        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        
        e.golpear(j);
        e.golpear(j);
        
        j.golpear(e);
        j.golpear(e);
        
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        
        System.out.println("Jugador");
        System.out.println("Nombre: " + j.getNombre());
        System.out.println("Sexo: " + j.getSexo());
        System.out.println("Posicion x: " + j.getPosicionX());
        System.out.println("Posicion y: " + j.getPosicionY());
        System.out.println("Damage: " + j.getDamage());
        System.out.println("Vida: " + j.getVida());
        System.out.println("Numero botiquines: " + j.getNumeroBotiquines());
        
        System.out.println("");
        
        System.out.println("Jugador");
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Sexo: " + e.getSexo());
        System.out.println("Posicion x: " + e.getPosicionX());
        System.out.println("Posicion y: " + e.getPosicionY());
        System.out.println("Damage: " + e.getDamage());
        System.out.println("Vida: " + e.getVida());
        System.out.println("Evoluciones aplicadas: " + e.getEvolucionesAplicadas());
        System.out.println("Resistencia: " + e.getResistencia());
        */
        
        Jugador j = new Jugador("Exploradora", 'f', - 1.0, -1.0, 130.0);
        Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);
        
        j.golpear(e);
        j.golpear(e);
        j.usarBotiquin();
        j.recogerBotiquin();
        j.recogerBotiquin();
        j.usarBotiquin();
        j.moverArriba(2);
        e.golpear(j);
        
        System.out.println("Jugador");
        System.out.println("Nombre: " + j.getNombre());
        System.out.println("Sexo: " + j.getSexo());
        System.out.println("Posicion x: " + j.getPosicionX());
        System.out.println("Posicion y: " + j.getPosicionY());
        System.out.println("Damage: " + j.getDamage());
        System.out.println("Vida: " + j.getVida());
        System.out.println("Numero botiquines: " + j.getNumeroBotiquines());
        
        System.out.println("");
        
        System.out.println("Jugador");
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Sexo: " + e.getSexo());
        System.out.println("Posicion x: " + e.getPosicionX());
        System.out.println("Posicion y: " + e.getPosicionY());
        System.out.println("Damage: " + e.getDamage());
        System.out.println("Vida: " + e.getVida());
        System.out.println("Evoluciones aplicadas: " + e.getEvolucionesAplicadas());
        System.out.println("Resistencia: " + e.getResistencia());
        /**/
        //double d = Math.sqrt(Math.pow((5 - 0), 2) + Math.pow((0 - 0), 2));
        //System.out.println(d);
        
    }
    
}
