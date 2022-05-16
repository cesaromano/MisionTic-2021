package challnge3version3;

public class Challnge3Version3 {

    public static void main(String[] args) {
        Bronce b = new Bronce('b', "bronce");
        
        System.out.println(b.isAireAcondicionadoEncendido());
        b.gestionarAireAcondicionado();
        System.out.println(b.isAireAcondicionadoEncendido());
    }
    
}
