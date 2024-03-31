package OOPS.Polymorphism;

public class Triangle extends Shapes {
    @Override //Annotation
    void area(){
        System.out.println("Area is 0.5*h*base.");
    }
}
