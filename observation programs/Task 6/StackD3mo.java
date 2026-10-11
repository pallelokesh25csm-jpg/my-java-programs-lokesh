import java.util.*;

class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack: " + s);

        System.out.println("Peek: " + s.peek());
        System.out.println("Pop: " + s.pop());
        System.out.println("Stack after pop: " + s);

        System.out.println("Empty: " + s.empty());
        System.out.println("Position of 10: " + s.search(10));
    }
}