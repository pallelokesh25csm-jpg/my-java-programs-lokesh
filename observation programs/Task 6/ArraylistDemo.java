import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add(1, "Orange");

        System.out.println("List: " + list);
        System.out.println("Get: " + list.get(1));

        list.set(1, "Grapes");
        System.out.println("After set: " + list);

        list.remove(2);
        list.remove("Apple");

        System.out.println("Contains Mango: " + list.contains("Mango"));
        System.out.println("Size: " + list.size());
        System.out.println("Index of Grapes: " + list.indexOf("Grapes"));
        System.out.println("Last index: " + list.lastIndexOf("Grapes"));
        System.out.println("Is Empty: " + list.isEmpty());

        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted: " + list);

        list.clear();
        System.out.println("After clear: " + list);
    }
}