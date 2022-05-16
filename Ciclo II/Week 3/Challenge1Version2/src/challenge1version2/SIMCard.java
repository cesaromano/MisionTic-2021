package challenge1version2;

public class SIMCard {
    
    //Atributes
    
    private String empresaTelefonia;
    
    private double saldo;
    
    private String numeroTelefono;
    
    private boolean celularApagado;
    
    private boolean modoAvionActivado;
    
    private boolean datosActivados;
    
    private int saldoDatos;
    
    //Constructor methods
    
    public SIMCard(String numeroTelefono) {
        this.empresaTelefonia = "HI";
        this.saldo = 0.0;
        this.numeroTelefono = numeroTelefono;
        this.celularApagado = true;
        this.modoAvionActivado = false;
        this.datosActivados = false;
        this.saldoDatos = 0;
    }
    //Methods
    
    public void comprarDatos(int c){
        
        if (c <= 10){
            
            double reference1 = c * 3000;  
            
            if(reference1 <= this.saldo){
            
                this.saldo -= reference1;
                this.saldoDatos += c;
                
            }else{}
 
        }
        
        if (c > 10 && c <= 30){
            
            double reference1 = 30000 + ((c * 2500) - 25000);  
            
            if(reference1 <= this.saldo){
            
            this.saldo -= reference1;
            this.saldoDatos += c;
                
            }else{}
            
        }
        
        if (c > 30){
            
            double reference1 = 60000 + ((c * 1500) - 30000);  
     
            if(reference1 <= this.saldo){
            
            this.saldo -= reference1;
            this.saldoDatos += c;
                
            }else{}
            
        }
        
    }

   public void consumirDatos(int c){
   
       if(this.celularApagado == false && this.modoAvionActivado == false){
       
           this.saldoDatos -= c;
           
       }else{}
       
   } 
    
    public void recargarSaldo(double s){
    
        this.saldo += s;
        
    }
    
    public void llamar(int s){
    
        if(this.celularApagado == false && this.modoAvionActivado == false){
        
            if(s <= 60){
            
               this.saldo -= s; 
                
            }else{
            
               this.saldo -= 60 + ((s / 2)-30);
                
            }
 
        }
        
    }
    
    public void gestionarEncendidoCelular(){
    
        if(this.celularApagado == true){
        
            this.celularApagado = false;
            
        }else{
        
            this.celularApagado = true;
            this.modoAvionActivado = false;
            this.datosActivados = false;
            
        }
        
    }
    
    public void gestionarModoAvion(){
    
        if(this.modoAvionActivado == false && this.celularApagado == false){
        
            this.modoAvionActivado = true;
            this.datosActivados = false;
            
        }else{
            this.modoAvionActivado = false;
        }
        
    }
    
    public void gestionarDatos(){
    
        if(this.modoAvionActivado == false && this.celularApagado == false){
        
            if(this.datosActivados == false){
            
                this.datosActivados = true;
                
            }else{
            
                this.datosActivados = false;
                
            }
 
        }else{
           
        }
        
    }
    
    //Setters and getters

    public String getEmpresaTelefonia() {
        return empresaTelefonia;
    }

    public void setEmpresaTelefonia(String empresaTelefonia) {
        this.empresaTelefonia = empresaTelefonia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public boolean isCelularApagado() {
        return celularApagado;
    }

    public void setCelularApagado(boolean celularApagado) {
        this.celularApagado = celularApagado;
    }

    public boolean isModoAvionActivado() {
        return modoAvionActivado;
    }

    public void setModoAvionActivado(boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }

    public boolean isDatosActivados() {
        return datosActivados;
    }

    public void setDatosActivados(boolean datosActivados) {
        this.datosActivados = datosActivados;
    }

    public int getSaldoDatos() {
        return saldoDatos;
    }

    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }

}
