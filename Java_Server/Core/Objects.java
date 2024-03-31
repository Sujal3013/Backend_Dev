class Calculator {
    int a;

    public int add(int a,int b) {
        System.out.println("Addition by Calculator");
        return a+b;
    }
}

class Mobile
{
     String brand;
    int price;
    String network;
    // static  - class member
    static String name;
    static{
        name="Phone";
    }
}

public class Objects {
    public static void main(String[] args) {
        int num1 = 4, num2 = 5;
        Calculator calc = new Calculator();
        int result=calc.add(num1,num2);
        // System.out.println(result);

        Mobile obj1=new Mobile();
        obj1.brand="Oneplus";
        obj1.price=50000;
        obj1.name="10T";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=20000;
        obj2.name="M325G";
        obj2.name="SmartPhone";
    }
}



// Object Oriented Programming
// Objects -Properties and Behaviours

// Class
