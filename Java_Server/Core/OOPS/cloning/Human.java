package OOPS.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr={3,4};

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human other){
        this.age=other.age;
        this.name=other.name;
    }
    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     // Shallow copy
    //     return super.clone();
    // }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // Deep copy
        Human twin=(Human)super.clone();//this makes shallow copy
        // make a deep copy
        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
