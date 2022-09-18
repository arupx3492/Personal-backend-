package Functional_Interface_2;

public class Impl_Interface_x implements Interface_x {

    @Override
    public void fun_1(String s) {
        System.out.println("welcome from external implementation "+s);
    }
}
