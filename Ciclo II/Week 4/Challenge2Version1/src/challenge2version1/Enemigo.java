package challenge2version1;

public class Enemigo extends Personaje{
    
    //Attributes
    int evolucionesAplicadas;
    int resistencia;
    
    //Constructor
    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
        this.evolucionesAplicadas = 0;
        this.resistencia = 1;
    }
    
    //Metthods
    public void evolucionar(){
        /*Si el enemigo que invoca este método tiene 30 puntos de vida (O menos) y
        evolucionesAplicadas es igual a 0, se suma 20 al atributo damage, y se suma 1
        a evolucionesAplicadas. Si el enemigo que invoca este método tiene 10 puntos de vida (O menos) y
        evolucionesAplicadas es igual a 1, se suma 1 al atributo resistencia, y se suma 1 a evolucionesAplicadas*/
        if(this.getVida() <= 30 && this.evolucionesAplicadas == 0){
            
            this.setDamage(this.getDamage() + 20);
            this.setEvolucionesAplicadas(this.getEvolucionesAplicadas() + 1);
            
        }if(this.getVida() <= 10 && this.evolucionesAplicadas == 1){
            
            this.setResistencia(this.getResistencia() + 1);
            this.setEvolucionesAplicadas(this.getEvolucionesAplicadas() + 1);
            
        }if(this.getVida() > 100){
            this.setVida(100);
        }
    }
    
    public void golpear(Jugador p) {
        super.golpear(p);
    }
    
    @Override
    public void recibirImpacto(double d/*Cantidad de vida a restarle al personaje*/){
        /*Resta d / resistencia a vida*/
        
    }
    
    //Getters y setters

    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    // ToString

    @Override
    public String toString() {
        return "Enemigo{" + "evolucionesAplicadas=" + evolucionesAplicadas + ", resistencia=" + resistencia + '}';
    }
    
}
