package OOPS.Inheritance;

public class Box{
    double l;
    double h;
    double w;
    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    // cube
    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
    static void greeting(){
        System.out.println("I am in box class.");
    }
    public void information(){
        System.out.println("Running the box");
    }
}
