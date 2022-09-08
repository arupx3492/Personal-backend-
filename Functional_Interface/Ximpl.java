package Functional_Interface;

public class Ximpl implements X{

    @Override
    public void print(String s) {
        System.out.println(s);
    }
    @Override
    public void fun1(String s){
        System.out.println("This is fun1 from implementation class");
    }

    public static void main(String[] args) {
        Ximpl x1=new Ximpl();
        x1.print("Arup Mahato");
        x1.fun1("s");
    }
}
