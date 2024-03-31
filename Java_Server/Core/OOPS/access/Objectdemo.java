package OOPS.access;

public class Objectdemo {
    int num;
    String name;
    Objectdemo(int num){
        this.num=num;
        this.name="Sujal";
    }
    @Override
    public int hashCode(){
        return this.num;
    }
    @Override
    public boolean equals(Object obj){
        return this.num==((Objectdemo)obj).num;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        Objectdemo obj=new Objectdemo(10);
        Objectdemo obj2=new Objectdemo(10);

        System.out.println(obj.hashCode());
        if(obj==obj2){
System.out.println("obj1 ==obj2");
        }
        if(obj.equals(obj2)){
            System.err.println("obj1.equals(obj2)");
        }
    }
}
