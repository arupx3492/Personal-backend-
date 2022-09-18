package Generics.wildCards.lowerBound;

import java.util.Arrays;
import java.util.List;

public class Demo {

    String intTostring(List<? super Integer> list){
      return "this is from intToString method";

    }

    public static void main(String[] args) {
        Demo d1=new Demo();
       String ans= d1.intTostring(Arrays.asList(34,45,56,7.6,87,8));
        System.out.println(ans);
    }

}
