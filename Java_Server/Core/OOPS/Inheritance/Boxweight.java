package OOPS.Inheritance;

public class Boxweight extends Box {
    double weight;
    Boxweight(){
        this.weight=-1;
    }
    Boxweight(double side,double weight){
        super(side); //parent class constructor :if not called then default parent constructor is called
        this.weight=weight;
    }
    Boxweight(Boxweight other){
        super(other);
        weight=other.weight;
    }
    // @Override
    static void greeting(){
        System.out.println("I am in Box weight class.");
    }
}
