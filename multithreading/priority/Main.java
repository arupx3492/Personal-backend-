package multithreading.priority;

public class Main extends Thread{

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Main m1=new Main();
        Main m2=new Main();
        System.out.println(m1.getPriority());
        System.out.println(m2.getPriority());
        m1.setPriority(8);
        m2.setPriority(9);
        System.out.println(m1.getPriority());
        System.out.println(m2.getPriority());

    }
}
