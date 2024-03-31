class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hey");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }    
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}

public class Threads {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        System.out.println(a.getPriority());
        b.setPriority(Thread.MAX_PRIORITY);
        // start threads
        a.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        b.start();

    }
}
