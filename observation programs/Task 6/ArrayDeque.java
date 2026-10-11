import java.util.*;

class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(20);
        dq.addLast(30);

        dq.offerFirst(10);
        dq.offerLast(40);

        System.out.println("Deque: " + dq);

        System.out.println("Peek First: " + dq.peekFirst());
        System.out.println("Peek Last: " + dq.peekLast());

        System.out.println("Poll First: " + dq.pollFirst());
        System.out.println("Poll Last: " + dq.pollLast());

        System.out.println("Final Deque: " + dq);
    }
}