package challenge4version3;

public class Challenge4Version3 {

    public static void main(String[] args) {
        Condominio c = new Condominio();
        
        c.agregarInmueble(new Inmueble("Casa", "1", 700000.0, 8));
        c.agregarInmueble(new Inmueble("Casa", "2", 1000000.0, 8));
        c.agregarInmueble(new Inmueble("Casa", "3", 1340000.0, 8));
        
        System.out.println(c.getInmuebles());
        
        //c.eliminarInmueble("2");
        
        System.out.println(c.getInmuebles());
        
        System.out.println(c.calcularArriendoMensualCondominio());
        System.out.println(c.promedioCostoInmueble());
        System.out.println(c.desviacionEstandarCostoInmueble());
        
        System.out.println(Math.pow(2, 3));
    }
    
}
