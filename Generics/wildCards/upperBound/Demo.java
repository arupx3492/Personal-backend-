package Generics.wildCards.upperBound;

import java.util.Arrays;
import java.util.List;

public class Demo {

    void upperBoundmethod(List<? extends String> s){
        System.out.println("This is upper bound example "+s);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.upperBoundmethod(Arrays.asList("ui","df","hg","rt"));
    }
}
