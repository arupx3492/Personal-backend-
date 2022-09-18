package multithreading.runnableInterface;

public class Main {


    public static void main(String[] args) {
        X x1=new X();
        Thread t1=new Thread(x1);
        Thread t2=new Thread(x1);
Thread.currentThread().setName("arup");
t1.setName("This is t1");
        t1.start();
        t2.start();

        for(int i=35;i<50;i++){
            System.out.println("This is from main thread");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
