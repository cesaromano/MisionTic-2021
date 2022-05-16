package arrays;

public class Assignment {
    
    public static void main(String[] args) {
        int[] values = new int[6];
        
        /* Manual assignment
        values[0] = 0;
        values[1] = 1;
        values[2] = 2;
        values[3] = 3;
        values[4] = 4;
        values[5] = 5;
        
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        System.out.println(values[3]);
        System.out.println(values[4]);
        System.out.println(values[5]);
        
        */
        
        for (int i = 0; i < values.length; i++) {
            values[i] = i;
        }

        for (int value : values) {
            System.out.println(value);
        }
    }
    
}
