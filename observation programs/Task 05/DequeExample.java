
import java.util.*;

class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();

        d.addFirst(20);
        d.addLast(30);
        d.addFirst(10);

        System.out.println("Deque: " + d);
        System.out.println("First: " + d.peekFirst());
        System.out.println("Last: " + d.peekLast());

        d.removeFirst();
        d.removeLast();

        System.out.println("Final Deque: " + d);
    }
}
