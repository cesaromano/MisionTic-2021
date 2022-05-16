package japp;

public class CuerpoDeAgua {
    
    int riesgo;
    String estado;

    public String nivel(int riesgo) {
        this.riesgo = riesgo;

        if (riesgo >= 0 && riesgo <= 5)
            estado = "SIN RIESGO";

        else if (riesgo > 5 && riesgo <= 14)
            estado = "BAJO";

        else if (riesgo > 14 && riesgo <= 35)
            estado = "MEDIO";

        else if (riesgo > 35 && riesgo <= 80)
            estado = "ALTO";

        else if (riesgo > 80 && riesgo <= 100)
            estado = "INVIABLE SANITARIAMENTE";

        return estado;
    }
}
