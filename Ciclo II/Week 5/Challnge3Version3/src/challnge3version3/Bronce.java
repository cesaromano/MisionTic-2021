package challnge3version3;

public class Bronce extends Asiento{

    public Bronce(char tipo, String ID){
        super(tipo, ID);
    }

    @Override
    public void gestionarAireAcondicionado() {
        /*Si el aire acondicionado está apagado, lo enciende, y si el aire
        acondicionado está encendido, lo apaga*/
        
        if(this.isAireAcondicionadoEncendido() == false){
            this.setAireAcondicionadoEncendido(true);
        }else{
            this.setAireAcondicionadoEncendido(false);
        }
    }

    @Override
    public void gestionarPantalla() {
        /*Si la pantalla está apagada, la enciende, y si la pantalla está
        encendida, la apaga*/
        
        if(this.isPantallaEncendida() == false){
            this.setPantallaEncendida(true);
        }else{
            this.setPantallaEncendida(false);}
    }

    @Override
    public void gestionarLuzLectura() {
        /*Si la luz de lectura está apagada, la enciende, y si la luz de lectura está
        encendida, la apaga*/
        
        if(this.isLuzLecturaEncendida() == false){
            this.setLuzLecturaEncendida(true);
        }else{
            this.setLuzLecturaEncendida(false);}
    }

    @Override
    public void gestionarLuzAsistencia() {
        /*Si la luz de asistencia está apagada, la enciende, y si la luz de
        asistencia está encendida, la apaga*/
        
        if(this.isLuzAsistenciaEncendida() == false){
            this.setLuzAsistenciaEncendida(true);
        }else{
            this.setLuzAsistenciaEncendida(false);}
    }

    @Override
    public void aumentarInclinacion(double d /*Cantidad de grados a aumentar*/){
        /*Suma d a inclinacionSilla (Nunca sobrepasando el límite especificado)*/
        
        this.setInclinacionSilla(this.getInclinacionSilla() + d);
        if(this.getInclinacionSilla() > 135){
            this.setInclinacionSilla(135);
        }
    }

    @Override
    public void disminuirInclinacion(double d /*Cantidad de grados a disminuir*/) {
        /*Resta d a inclinacionSilla (Nunca sobrepasando el límite especificado)*/
        
        this.setInclinacionSilla(this.getInclinacionSilla() - d);
        if(this.getInclinacionSilla() < 0){
            this.setInclinacionSilla(0);
        }
    }

    @Override
    public String imprimirMenuPantalla() {
        /*Retorna el texto: “BRONCE”*/
        String a = "BRONCE";
        return a;
    }
    
}
