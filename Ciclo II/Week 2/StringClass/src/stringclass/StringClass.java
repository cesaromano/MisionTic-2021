package stringclass;

public class StringClass {

    public static void main(String[] args) {
        
        // Declaration
        String hi = "Hello world";
        String bye = new String("Bye wold");
        char character = 'A';
        
        //System.out.println(hi);
        //System.out.println(bye);
        
        //Concatenation
        
        //System.out.println(hi + " " + bye + " " + character);
        
        for(int index = 0; index < hi.length(); index++){
        
            System.out.println(hi.charAt(index));
            
        }
        
        System.out.println("");
        
        // Methods
        int quantity = hi.length();
        System.out.println(quantity);
        
        boolean exist = hi.contains("hi");
        System.out.println(exist);
        
        // lower case
        System.out.println(hi.toLowerCase());
        // upper case
        System.out.println(hi.toUpperCase());
        
        exist = hi.toLowerCase().contains("hi");
        System.out.println(exist);
        
        // concatenation
        String name = "Bruce" + "Wayne";
        System.out.println(name);
        
        //name.concat("is batman");
        System.out.println(name);
        System.out.println(name.concat("is batman"));
        
        // String builder
        StringBuilder stringBuilder = new StringBuilder("Bruce");
        stringBuilder.append("Bruce");
        
        System.out.println(stringBuilder);
        
        boolean start = name.startsWith("B");
        System.out.println(start);
        
        System.out.println(" Hola ".trim());
        System.out.println(" Hola ".replace("o", "e"));
        
        // Give format
        float value = 10.9283f;
        String message = String.format("%.2f", value);
        System.out.println(message);
        
        // Comparation
        String chain1 = new String("Hi");
        String chain2 = "Hi";
        System.out.println(chain1 == chain2); // compare memory space
        System.out.println(chain1.equals(chain2));
        // Comparison ignoring upper case
        System.out.println(chain1.equalsIgnoreCase(chain2));
        
    }
    
}
