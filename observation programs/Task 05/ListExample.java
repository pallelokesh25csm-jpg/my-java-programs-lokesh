
import java.util.*;

class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add(1, "Mango");

        System.out.println(list);
        System.out.println("Element: " + list.get(1));

        list.set(1, "Orange");
        System.out.println("Updated: " + list);

        System.out.println("First Apple index: "
                           + list.indexOf("Apple"));
        System.out.println("Last Apple index: "
                           + list.lastIndexOf("Apple"));

        list.remove(0);
        System.out.println("Final List: " + list);
    }
}
