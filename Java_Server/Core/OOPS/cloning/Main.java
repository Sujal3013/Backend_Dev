package OOPS.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human sujal=new Human(24,"Sujal Mishra");
        // Human twin=new Human(sujal);
        Human twin=(Human)sujal.clone();
    }
}
