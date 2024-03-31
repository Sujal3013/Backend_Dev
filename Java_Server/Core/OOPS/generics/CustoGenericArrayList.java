package OOPS.generics;

import java.util.Arrays;

public class CustoGenericArrayList<T> {
    private Object[] data;
    private int DEFAULT_SIZE=10;
    private int size=0;
    public CustoGenericArrayList() {
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize() {
        Object[] temp=new Object[data.length*2];
        // copy the current item in new array
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    private boolean isFull() {
        return size==data.length;
    }
    public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }
    
    
    @Override
    public String toString() {
        return "CustoGenericArrayList ["+"data="+Arrays.toString(data)+", size="+size+"]";
    }
    public static void main(String[] args) {
        // ArrayList list=new ArrayList();
        // list.add(45);
        // list.remove(0);
        // list.get(0);
        // list.set(1,698);

        CustoGenericArrayList list=new CustoGenericArrayList();
        // list.add(3);
        // list.add(5);
        // list.add(9);
        for(int i=0;i<14;i++){
            list.add(2*i);
        }


        System.out.println(list);

        CustoGenericArrayList<Integer> list2=new CustoGenericArrayList<>();
        list2.add(45);
        list.add("dff");
        
    }
}
