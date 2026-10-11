
import java.util.*;

class SetExample {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        s.add(10);
        s.add(20);
        s.add(10);
        s.add(30);

        System.out.println("Set: " + s);
        System.out.println("Contains 20: " + s.contains(20));

        s.remove(20);
        System.out.println("After removal: " + s);
        System.out.println("Size: " + s.size());
    }
}
