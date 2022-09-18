package multithreading.runnableInterface;

public class X implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<13;i++){
            System.out.println("this is from  external  x_implementation class"+i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
