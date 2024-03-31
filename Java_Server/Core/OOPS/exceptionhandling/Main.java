package OOPS.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=1;
        try{
            // int c=a/b;
            divide(a,b);
            throw new MyException("I created this exception.");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("All done");
        }
    }
    static int divide(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Do not divide by zero");
        }
        return a/b;
    }
}
