package collection_Framework.map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMap {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(4,"four");
        hm.put(null,null);
        System.out.println(hm);
        Set<Integer> set=hm.keySet();
        for(Integer s:set){
            System.out.println("The keys are"+s);
        }
    }
}
/*
* we can't print the hashmap directly
* if we want to print only key then we have to use the .ketSet() method in will return a set of type key.
* */