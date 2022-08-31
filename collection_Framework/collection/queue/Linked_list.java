package collection_Framework.collection.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Linked_list {
    public static void main(String[] args) {
        Queue<Integer> qd=new LinkedList<>();
        qd.offer(1);
        qd.offer(2);
        qd.offer(3);
        qd.offer(4);
        qd.offer(5);
        qd.offer(6);
        qd.offer(7);
        qd.offer(8);
        qd.add(9);
        System.out.println(qd);
        qd.poll();
        System.out.println(qd);
        System.out.println(qd.peek());
        System.out.println(qd);
    }
}
