package OOPS.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i*2);
        }
        // arr.forEach((i)->{System.out.print(i-1+" ");});

        Consumer<Integer> fun=(item)->System.out.println(item*2);
        arr.forEach(fun);

        Operation sum=(a,b)->a+b;
        Operation product=(a,b)->a*b;


    }
    private int operate(int a,int b,Operation op){
        return op.operation(a, b);
    }
}
/*
 * Operation
 */
interface Operation{
    int operation(int a,int b);
}
