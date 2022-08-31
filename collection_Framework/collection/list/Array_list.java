package collection_Framework.collection.list;

import java.util.*;

public class Array_list {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
                List<String> list1 = new ArrayList<String>();
                list1.add("thisisfromarr1");

        list.add("arup");
        list.add("ankit");
        list.add("amar");
        list.add("pravsh");
        list.add("partha");
        list.add("pranab");
        System.out.println(list);
        list.remove("arup");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list1.isEmpty());
        System.out.println(list.size());

    }
    }
//}
