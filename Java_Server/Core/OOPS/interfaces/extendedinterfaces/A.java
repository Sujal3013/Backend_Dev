package OOPS.interfaces.extendedinterfaces;

public interface A {
    // static interface methods should always have a body
    static void greet(){
        System.out.println("Hey I am static");
    }
    void fun();
}
