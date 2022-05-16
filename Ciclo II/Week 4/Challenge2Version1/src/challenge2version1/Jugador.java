package challenge2version1;

public class Jugador extends Personaje{
    
    //Attributes
    private int numeroBotiquines;
 
    
    //Constructor
    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
        this.numeroBotiquines = 0;
    }
    
    //Methods
    public void usarBotiquin(){
        /*Resta 1 a numeroBotiquines y suma 5 a vida (Solo si el jugador tiene
        botiquines)*/
        if(this.numeroBotiquines > 0){
            this.numeroBotiquines -= 1;
            this.setVida(this.getVida() + 5);
        }if(this.getVida() > 100){
            this.setVida(100);
        }
        
    }
    
    public void recogerBotiquin(){
        /*Suma 1 a numeroBotiquines*/
        this.numeroBotiquines += 1;
    }
    
    public void moverDerecha(double d /*Cantidad de pixeles a mover el personaje
    a la derecha.*/){
        /*Suma d a posicionX*/
        this.setPosicionX(this.getPosicionX() + d);
    }
    
    public void moverIzquierda(double d /*Cantidad de pixeles a mover el personaje
    a la izquierda.*/){
        /*Resta d a posicionX*/
        this.setPosicionX(this.getPosicionX() - d);
    }
    
    public void moverArriba(double d /*Cantidad de pixeles a mover el personaje
    hacia arriba.*/){
        /*Suma d a posicionY*/
        this.setPosicionY(this.getPosicionY() + d);
    }
    
    public void moverAbajo(double d /*Cantidad de pixeles a mover el personaje
    hacia abajo*/){
        /*Resta d a posicionY*/
        this.setPosicionY(this.getPosicionY() - d);
    }

    //@Override
    public void golpear(Enemigo p) {
        super.golpear(p);
        p.evolucionar();
    }
    
    //Getters and setters

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    //To string
    @Override
    public String toString() {
        return "Jugador{" + "numeroBotiquines=" + numeroBotiquines + '}';
    }
    
}
