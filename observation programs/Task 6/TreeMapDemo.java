import java.util.*;

class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "Java");
        map.put(20, "Python");
        map.put(40, "HTML");

        System.out.println("TreeMap: " + map);

        System.out.println("Get 20: " + map.get(20));

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        System.out.println("Higher Key 20: " + map.higherKey(20));
        System.out.println("Lower Key 20: " + map.lowerKey(20));

        System.out.println("Ceiling Key 25: " + map.ceilingKey(25));
        System.out.println("Floor Key 25: " + map.floorKey(25));

        System.out.println("Entries: " + map.entrySet());

        map.remove(10);

        System.out.println("After remove: " + map);
    }
}