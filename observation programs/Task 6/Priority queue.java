import java.util.*;

class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.offer(30);
        pq.add(20);

        System.out.println("Priority Queue: " + pq);

        System.out.println("Peek: " + pq.peek());
        System.out.println("Poll: " + pq.poll());

        System.out.println("Contains 30: " + pq.contains(30));

        pq.remove(30);

        System.out.println("Size: " + pq.size());
        System.out.println("Final Queue: " + pq);
    }
}