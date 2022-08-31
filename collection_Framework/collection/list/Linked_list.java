package collection_Framework.collection.list;
import java.util.*;
public class Linked_list {
    public static void main(String[] args) {
       LinkedList<String> al=new LinkedList<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ravi");
  al.add("Ajay");
        System.out.println(al);
        al.remove();
        System.out.println(al);


    }
}
/*
* Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure.
* It inherits the AbstractList class and implements List and Deque interfaces.
* */