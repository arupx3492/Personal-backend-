package multithreading.Two_ThreadSingleObject;

import static java.lang.Thread.currentThread;

public class X implements  Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(currentThread().getName()+" "+i);
        }
    }
}
