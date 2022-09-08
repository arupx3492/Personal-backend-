package Functional_Interface;
@FunctionalInterface
public interface X {

    //A functional Interface can have N number of default and static method
    //Note: A functional interface can extends another interface only when it does not have any abstract
   //method.


   //abstract method
    void print(String s);
//default method
    default void fun1(String s){
        System.out.println("This is default void fun1 method");
    }
    //static method
    static void fun2(String s){
        System.out.println("This is static void fun2 method");
    }
}
