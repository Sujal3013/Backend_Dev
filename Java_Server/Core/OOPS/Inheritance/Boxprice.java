package OOPS.Inheritance;

public class Boxprice extends Boxweight {
    double cost;
    Boxprice(){
        super();
        this.cost=-1;
    }
    Boxprice(Boxprice other){
        super(other);
        this.cost=other.cost;
    }
    Boxprice(double side,double weight,double cost){
        super(side,weight);
        this.cost=cost;
    }
}
