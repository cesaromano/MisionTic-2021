package arrays;

public class Arrays {

    public static void main(String[] args) {
        // Array statemen opt. 1
        
        //int marks [] = new int[5];
        
        // Array statement opt. 2
        
        //int[] marks = new int[5];
        
        // Array statement opt. 3
        
        int[] marks = {9,8,5,1,6};
        int add = 0;
        // Going through an array opt.1
        
        //for (int index = 0; index < marks.length; index++) {
        //    add += marks[index];
        //}
        
        //System.out.println(add);
        
        // Going through an array opt.2
        
        for (int mark : marks) {
            add += mark;
        }
        
        System.out.println(add);
        
    }
    
}
