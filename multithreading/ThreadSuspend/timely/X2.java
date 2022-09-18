package multithreading.ThreadSuspend.timely;

public class X2 implements  Runnable{
        @Override
    public void run() {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
             System.out.println("Mahato");
        }
}
