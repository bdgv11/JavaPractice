import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class MapsDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> age = new HashMap<>();

        age.put("Bryan", 27);
        age.put("Daniel", 15);
        age.put("Montserrat", 26);

        System.out.println("All keys: " + age.keySet());
        System.out.println("All values: " + age.values());
        System.out.println("All pairs: " + age.entrySet());

        age.replace("Bryan", 33);
        System.out.println("All pairs: " + age.entrySet());

        for (String keyString : age.keySet()) {
            System.out.println("Key: " + keyString + " Value: " + age.get(keyString));
            System.out.println(keyString + age.get(keyString));
        }

        Iterator iterator = age.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println("Entry set: " + iterator.next());
        }
        System.out.println("-------");

        Iterator<Map.Entry<String, Integer>> iterator2 = age.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> entry = iterator2.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

        // BETTER ONE FOR HASHMAPS
        System.out.println("-------");
        for (Map.Entry<String, Integer> entry : age.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
