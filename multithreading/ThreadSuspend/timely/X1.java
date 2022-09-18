package multithreading.ThreadSuspend.timely;

public class X1 implements  Runnable{
       @Override
    public void run() {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("arup");
    }
}
