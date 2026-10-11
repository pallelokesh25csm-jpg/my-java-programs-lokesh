import java.util.*;

class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.addFirst("Start");
        list.addLast("End");

        System.out.println("List: " + list);
        System.out.println("Get: " + list.get(2));
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.remove(1);
        list.remove("C");

        list.removeFirst();
        list.removeLast();

        list.offer("X");
        System.out.println("After offer: " + list);

        System.out.println("Peek: " + list.peek());
        System.out.println("Poll: " + list.poll());

        System.out.println("Final List: " + list);
    }
}