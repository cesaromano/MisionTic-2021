package challnge3version3;

public abstract class Asiento {
    //Attributes
    private String ID;
    private char tipo;
    private boolean pantallaEncendida;
    private double inclinacionSilla;
    private boolean luzLecturaEncendida;
    private boolean luzAsistenciaEncendida;
    private boolean aireAcondicionadoEncendido;
    
    //Constructor

    public Asiento(char tipo, String ID){
        this.tipo = tipo;
        this.ID = ID;
        this.pantallaEncendida = false;
        this.inclinacionSilla = 90;
        this.luzLecturaEncendida = false;
        this.luzAsistenciaEncendida = false;
        this.aireAcondicionadoEncendido = false;
    }
    
    //Methods
    public abstract void gestionarAireAcondicionado();
    public abstract void gestionarPantalla();
    public abstract void gestionarLuzLectura();
    public abstract void gestionarLuzAsistencia();
    public abstract void aumentarInclinacion(double d);
    public abstract void disminuirInclinacion(double d);
    public abstract String imprimirMenuPantalla();
    
    //Setter and getter

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isPantallaEncendida() {
        return pantallaEncendida;
    }

    public void setPantallaEncendida(boolean pantallaEncendida) {
        this.pantallaEncendida = pantallaEncendida;
    }

    public double getInclinacionSilla() {
        return inclinacionSilla;
    }

    public void setInclinacionSilla(double inclinacionSilla) {
        this.inclinacionSilla = inclinacionSilla;
    }

    public boolean isLuzLecturaEncendida() {
        return luzLecturaEncendida;
    }

    public void setLuzLecturaEncendida(boolean luzLecturaEncendida) {
        this.luzLecturaEncendida = luzLecturaEncendida;
    }

    public boolean isLuzAsistenciaEncendida() {
        return luzAsistenciaEncendida;
    }

    public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida) {
        this.luzAsistenciaEncendida = luzAsistenciaEncendida;
    }

    public boolean isAireAcondicionadoEncendido() {
        return aireAcondicionadoEncendido;
    }

    public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido) {
        this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Asiento{" + "tipo=" + tipo + ", ID=" + ID + ", pantallaEncendida=" + pantallaEncendida + ", inclinacionSilla=" + inclinacionSilla + ", luzLecturaEncendida=" + luzLecturaEncendida + ", luzAsistenciaEncendida=" + luzAsistenciaEncendida + ", aireAcondicionadoEncendido=" + aireAcondicionadoEncendido + '}';
    }
}
