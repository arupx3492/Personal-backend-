package multithreading.Two_ThreadSingleObject;

public class XDemo {
    public static void main(String[] args) {
        X x=new X();
        Thread t1=new Thread(x);
        Thread t2=new Thread(x);
        t1.setName("This is t1 thread");
        t2.setName("This is  t2 thread");
//        t1.setPriority(10);
         t2.setPriority(8);

        t1.start();
        t2.start();
    }
}
