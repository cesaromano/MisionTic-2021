package challenge4version1;

public class Challenge4Version1 {

    public static void main(String[] args) {
        Nomina n = new Nomina();
        
        n.agregarTrabajador(new Trabajador("Romano", "1018482793", 40000.0, 8, 6, 2, 1996));
        n.agregarTrabajador(new Trabajador("Nicoll", "1018482797", 40000.0, 8, 6, 2, 2000));
        n.agregarTrabajador(new Trabajador("Romano", "1018482793", 40000.0, 8, 6, 2, 1996));
        
        
        System.out.println(n.getTrabajadores());
        
        //n.eliminarTrabajador("1018482793");
        
        System.out.println(n.getTrabajadores());
        
        System.out.println(n.calcularSalarioQuincenalNomina());
        
        System.out.println(n.promedioEdadNomina());
        
        System.out.println(n.desviacionEstandarEdadNomina());
    }
    
}
