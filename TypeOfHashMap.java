import java.util.*;

public class typeOfHashmap {
    public static void main(String[] args) {

        // HashMap data
        HashMap<String, Integer> map1 = new HashMap<>();

        map1.put("apple", 120);
        map1.put("Banana", 50);
        map1.put("cherry", 80);
        map1.put("Dates", 150);

        System.out.println("HashMap class map look like: "+ map1);
        System.out.println();

        // LinkedMap data
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();

        map2.put("apple", 120);
        map2.put("Banana", 50);
        map2.put("cherry", 80);
        map2.put("Dates", 150);

        // TreeMap data
        System.out.println("LinkedHashMap class map look like: "+ map2);
        System.out.println();

        TreeMap<String, Integer> map3 = new TreeMap<>();

        map3.put("apple", 120);
        map3.put("Banana", 50);
        map3.put("cherry", 80);
        map3.put("Dates", 150);

        System.out.println("TreeMap class map look like: "+ map3);
    }
}