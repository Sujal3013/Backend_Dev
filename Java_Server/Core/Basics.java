/**
 * Test
 */
public class Basics {

    public static void main(String[] args) {
        // basics
        int x=5;
        System.out.println(x);

        // Type casting
        int a=12;
        byte k=(byte)a; //explicit conversion
        System.out.println(k);

        byte c=10,d=30; 
        int result=c*d; //promotion of datatype
        System.out.println(result);

        // Loops
        // for loop - finite number based loop
        for(int i=0;i<x;i++){
            System.out.println("Hi");
        }
        // while loop -  conditional loop
        while(x<10){
            System.out.println("Hello");
            x++;
        }

        // STRINGS -IMMUTABLE
        String s=new String("SUJAL");
        s=s+" MISHRA";

        // MUTABLE
        // String Buffer - thread safe
        StringBuffer sb=new StringBuffer("Sujal");
        System.out.println(sb.capacity());
        sb.deleteCharAt(1);
        sb.insert(4, "Ji");
        System.out.println(sb);

    }
}