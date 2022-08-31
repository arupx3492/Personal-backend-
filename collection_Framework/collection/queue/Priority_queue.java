package collection_Framework.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_queue {

    public static void main(String[] args) {
        Queue<Integer>  pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(1);
        pq.offer(1);
        pq.offer(1);
        pq.offer(1);
        pq.offer(1);
        pq.offer(1);
        pq.offer(1);
//        System.out.println(pq);
        Iterator ite=pq.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

    }
}
