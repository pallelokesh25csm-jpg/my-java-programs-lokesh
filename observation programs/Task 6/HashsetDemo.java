import java.util.*;

class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");   // Duplicate ignored

        System.out.println("Set: " + set);

        System.out.println("Contains Mango: " + set.contains("Mango"));

        set.remove("Banana");

        System.out.println("After remove: " + set);
        System.out.println("Size: " + set.size());
        System.out.println("Empty: " + set.isEmpty());

        set.clear();

        System.out.println("After clear: " + set);
    }
}