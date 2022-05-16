package japp;

import java.util.Scanner;

public class JApp {

    public static void main(String[] args) {
        double identificador = 0; 


        Scanner sc = new Scanner(System.in);
        int cantCueAgua = sc.nextInt();
        int [] clasificacion = new int[cantCueAgua];

        for (int i = 0; i <= cantCueAgua; i++){
            
            String [] info = sc.nextLine().split(" ");

            for (int j = 0; j < info.length; j++){
                
                if (j == 1){
                    clasificacion[i-1] = Integer.parseInt(info[j]);
                }
                
            }

        }
        
        for (int i = 0; i < cantCueAgua; i++) {
            CuerpoDeAgua cuerpoDeAgua = new CuerpoDeAgua();
            identificador = i + 2;
            System.out.println(cuerpoDeAgua.nivel(clasificacion[i]) + " " + identificador);
        }
        
        

        
        /*double addition = 0, average = 0, goverment = 0;
        int cont = 0;
        String state = "", state1 = ""; 

        

        String size = info.nextLine();
        int size1 = Integer.parseInt(size);

        String chain = info.nextLine();
        String chain1[] = chain.split(" ");

        double percentaje[] = new double[size1]; 

        for (int i = 0; i < size1; i ++){
            percentaje[i] = Double.parseDouble(chain1[i]);

            addition += percentaje[i];

            if (percentaje[i] > 80 && percentaje[i] <= 100){
                goverment += 1;
            }

            if (percentaje[i] >= 0 && percentaje[i] <= 5){
                if (cont < 5){
                    state1 = "SIN RIESGO";
                    cont = 5;
                }
            }
            else if (percentaje[i] > 5 && percentaje[i] <= 14){
                if (cont < 4){
                    state1 = "BAJO";
                    cont = 4;
                }
            }
            else if (percentaje[i] > 14 && percentaje[i] <= 35){
                if (cont < 3){
                    state1 = "MEDIO";
                    cont = 3;
                }
            }
            else if (percentaje[i] > 35 && percentaje[i] <= 80){
                if (cont < 2){
                    state1 = "ALTO";
                    cont = 2;
                }
            }
            else if (percentaje[i] > 80 && percentaje[i] <= 100){
                if (cont < 1){
                    state1 = "INVIABLE SANITARIAMENTE";
                    cont = 1;
                }
            }
        }

        average = addition / size1;

        if (average >= 0 && average <= 5)
            state = "SIN RIESGO";
        else if (average > 5 && average <= 14)
            state = "BAJO";
        else if (average > 14 && average <= 35)
            state = "MEDIO";
        else if (average > 35 && average <= 80)
            state = "ALTO";
        else if (average > 80 && average <= 100)
            state = "INVIABLE SANITARIAMENTE";

        System.out.println(state);
        System.out.println(String.format("%.2f", goverment));
        System.out.println(state1);*/
    }
}