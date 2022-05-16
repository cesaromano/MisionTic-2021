package estructurascontrol;

public class MultidimensionalArray {

        public static void main(String[] args){
/*            
//Creacion y asignacion
            
            int [][] matrix = new int [4][3];
            
            // x = 0, y = 0
            // value asignment
            
            
            
            matrix[0][0] = 1;
            matrix[0][1] = 2;
            matrix[0][2] = 3;
            
            matrix[1][0] = 4;
            matrix[1][1] = 5;
            matrix[1][2] = 6;
            
            matrix[2][0] = 7;
            matrix[2][1] = 8;
            matrix[2][2] = 9;
            
            
            //Getting values opt.1
            System.out.println(matrix[2][2]);
            
            //Getting values opt.2
            
            for (int posx = 0; posx < matrix.length; posx++) {
                
                if(posx == 2){
                    break;
                }
                                
                for (int posy = 0; posy < matrix[posx].length; posy++) {
                    matrix[posx][posy] = posy * 2;
                }
       
            }
            
            for(int[] row:matrix){
                for(int column:row){
                    System.out.print(column+ "");
                }
                System.out.println("");
            }
         */

         int[][] marks = new int[5][];
         
         marks[0] = new int[1];
         marks[1] = new int[2];
         marks[2] = new int[3];
         marks[3] = new int[4];
         marks[4] = new int[5];
         
         marks[0][0] = 8;
         
         marks[1][0] = 2;
         marks[1][1] = 2;
         
         marks[2][0] = 3;
         marks[2][1] = 3;
         marks[2][2] = 3;
         
         marks[3][0] = 3;
         marks[3][1] = 3;
         marks[3][2] = 3;
         marks[3][3] = 3;

         for(int[] fila : marks){
             
         }
         
        }
    
}
