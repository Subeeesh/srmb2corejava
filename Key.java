import java.util.*;
import java.util.Map.Entry;

public class Key {
    public static void main(String[] args)
    {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put(1, 10);
        map.put(2, 30);
        map.put(3, 20);


        System.out.println(map);


        int minValue=(Collections.min(map.values()));
        int maxKey=(Collections.max(map.keySet()));

        System.out.println(minValue);
        System.out.println(maxKey);

    }

}