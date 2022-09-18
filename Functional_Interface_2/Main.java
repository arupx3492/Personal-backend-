package Functional_Interface_2;

public class Main {

    public static void main(String[] args) {
        // I Implement this interface using External class
        System.out.println("This is main mehod of Main class");
        Interface_x ix=new Impl_Interface_x();
        ix.fun_1("Arup");

        // Using Anonymous Inner class
        Interface_x ix2=new Interface_x() {
            @Override
            public void fun_1(String s) {
                System.out.println("Welcome message from anonymous inner class:- "+s);
            };
        };
        ix2.fun_1("Interface_x");

        //Using Lambda function
        Interface_x ix3=s-> System.out.println("Welcome message from lambda expression"+s);
        ix3.fun_1("Interface_x");

        //Using method reference
        Interface_x ix4=ix::fun_1;
        ix4.fun_1("Interface_x");
    }
}
