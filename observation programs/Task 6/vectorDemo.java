import java.util.*;

class VectorDemo {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Java");
        v.add("Python");
        v.add("C");

        v.addElement("C++");

        System.out.println("Vector: " + v);
        System.out.println("Element: " + v.get(1));

        v.set(1, "HTML");
        System.out.println("After set: " + v);

        v.remove(2);
        v.removeElement("C++");

        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Contains Java: " + v.contains("Java"));
    }
}