
import java.util.*;

class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Queue: " + q);
        System.out.println("Head: " + q.peek());

        System.out.println("Removed: " + q.poll());
        System.out.println("After removal: " + q);
        System.out.println("Size: " + q.size());
    }
}
