package challenge2version1;

public class Personaje {
    
    //Attributes
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida;

    //Constructor
    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
        this.vida = 100;
    }

    //Methods
    
    public void golpear(Personaje p/*Personaje que recibe el daño*/){
        /*Resta damage/d al atributo vida del personaje p, donde d es la distancia 
        entre el personaje que invoca el método y el personaje p*/
        p.setVida(p.getVida() - (this.damage/this.calcularDistanciaRespectoPersonaje(p)));
        if(p.getVida() < 0){
            p.setVida(0);
        }
    }
    
    public void recibirImpacto(double d/*Cantidad de vida a restarle al personaje*/){
        /*Resta d a vida*/
    }
    
    public double calcularDistanciaRespectoPersonaje(Personaje p/*Personaje con el
    que se desea calcular la distancia*/){
        /*Retorna la distancia entre el personaje que invoca el método y el 
        personaje p (Que entró como parámetro).*/
        double d = Math.sqrt(Math.pow((this.posicionX - p.posicionX), 2) + 
                   Math.pow((this.posicionY - p.posicionY), 2));
        return d;
    }
    
    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", sexo=" + sexo + ", posicionX=" + posicionX + ", posicionY=" + posicionY + ", damage=" + damage + ", vida=" + vida + '}';
    }
    
}
