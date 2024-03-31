package OOPS.Polymorphism;

public class Main {
public static void main(String[] args) {
    Shapes shape=new Shapes();

    // Run-time Polymorphism : Overriding due to upcasting.
    // Parent obj= new Child();
    // Here,Which method will be called depends upon child class,it is called Upcasting.
    Shapes circle=new Circle();
    Triangle triangle=new Triangle();

    shape.area();
    circle.area();
    triangle.area();
}
}
