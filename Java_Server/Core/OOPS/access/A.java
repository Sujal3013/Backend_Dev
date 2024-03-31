package OOPS.access;
// Private : only in this file
// Public : everywhere
// Default : In the same package it is allowed
// Protected : Mainly during inheritance
public class A {
    private int num;
    protected String name;
    int[] arr;
    // GETTER
    public int getNum(){
        return num;
    }
    // SETTER
    public void setNum(int num){
        this.num=num;
    }

    A(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
    
}
