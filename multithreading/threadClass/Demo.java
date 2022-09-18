package multithreading.threadClass;

public class Demo extends Thread{

    @Override
    public void run() {
      for(int i=10;i<20;i++){
          System.out.println("This is from second thread "+i+985);
      }
    }

    public static void main(String[] args) {

        Demo d1=new Demo();
        d1.start();

        for (int i = 0; i < 10; i++){
            System.out.println("This is from main thread "+i*1000);
        }
    }
}
