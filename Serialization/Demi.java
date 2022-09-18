package Serialization;

import java.io.Serializable;

public class Demi implements Serializable {
    int x;

    public Demi(int f) {
        this.x = f;
    }
    void fun1(){
        System.out.println(x);
        System.out.println("This is from x method from Demi class");
    }
}
