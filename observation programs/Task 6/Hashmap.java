import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Lokesh");
        map.put(2, "Praveen");
        map.put(3, "Rahul");

        System.out.println("Map: " + map);

        System.out.println("Value of key 2: " + map.get(2));

        map.remove(3);

        System.out.println("Contains key 1: " + map.containsKey(1));
        System.out.println("Contains value Lokesh: " +
                           map.containsValue("Lokesh"));

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        System.out.println("Size: " + map.size());
        System.out.println("Default value: " +
                           map.getOrDefault(5, "Not Found"));

        map.clear();

        System.out.println("After clear: " + map);
    }
}