package Functional_Interface;

public class anonymous_Inner_class {
    public static void main(String[] args) {
        // I implement this interface using anonymous Inner class.
        X x=new X() {
            @Override
            public void print(String s) {
                System.out.println("This is the print function from anonymous innerclass");
            }
        };
        x.print("S");

        //This is using lambda function
        X x1=s-> System.out.println("This is the print function form  lambda function");
        x1.print("v");
    }
}
