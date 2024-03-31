// class AB implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hey");
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class CD implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }

//     }
// }


class Counter {
    int count;

    public synchronized void increment() {
         count++;
    }
}

public class Runnables {
    public static void main(String[] args) {
        Counter c = new Counter();

        Runnable a = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }

        };
        Runnable b = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }

        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        // start threads
        t1.start();
        t2.start();
        System.out.println(c.count);
    }
}
