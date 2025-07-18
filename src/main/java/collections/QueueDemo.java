package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new PriorityQueue<>();
        myQueue.add(12);
        myQueue.add(54);
        myQueue.add(1);
        myQueue.add(92);
        myQueue.offer(13);
        System.out.println(myQueue.poll());
    }
}
