package OOPS;
class Test1{
    String name;
    public Test1(String name){
        this.name=name;
    }
}
// outside classes can't be static because it is not dependent on any other class.
public class InnerClasses {
    // inner classes can be static
    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        // Test a=new Test("Sujal"); ERROR: Because inner class is dependent on outer class
        Test1 b=new Test1("Shreeti");
        Test a=new Test("Sujal");
        Test c=new Test("Akshat");

        System.out.println(a.name);
        System.out.println(c.name);
    }
}
