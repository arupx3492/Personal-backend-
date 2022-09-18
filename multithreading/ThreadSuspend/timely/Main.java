package multithreading.ThreadSuspend.timely;

import Functional_Interface.X;

public class Main {
    public static void main(String[] args) {
      x greeting=new x();
      X1 name=new X1();
      X2 sname=new X2();

      Thread t1=new Thread(greeting);
      Thread t2=new Thread(name);
      Thread t3=new Thread(sname);
    t1.start();
    t2.start();
    t3.start();
    }
}
