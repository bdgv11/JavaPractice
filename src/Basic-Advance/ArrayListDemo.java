import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Diff between Array & ArrayList<>
        // Array has a size and ArrayList doesn't
        // Array is more simple, ArrayList could grow
        //

        ArrayList<String> ourList = new ArrayList<>();
        ourList.add("Bryan");
        System.out.println(ourList);

        ourList.add("David");
        System.out.println(ourList);

        ourList.add("Daniel");
        System.out.println(ourList);

        System.out.println(ourList.get(0));

        ourList.set(0, "TestSet");
        System.out.println(ourList);

        ourList.remove(0);
        System.out.println(ourList);

        ourList.add("Test1");
        ourList.add("Test2");
        ourList.add("Test3");
        ourList.add("Test4");
        ourList.add("Test5");
        System.out.println(ourList);

        System.out.println("There are " + ourList.size() + " items in the ARRAYLIST");

        System.out.println(ourList + " contains Bryan: " + ourList.contains("Bryan"));
        System.out.println(ourList + " contains Test1: " + ourList.contains("Test1"));

        System.out.println("Index of Test1: " + ourList.indexOf("Test1"));
        System.out.println("Is empty? " + ourList.isEmpty());

        System.out.println("- - - - -");
        for (String value : ourList) {
            System.out.println(value);
        }

        System.out.println("- - - - -");
        for (int i = 0; i < ourList.size(); i++) {
            System.out.println("For position " + i + " the name is: " + ourList.get(i));
        }

        // ITERATOR
        Iterator<String> iterator = ourList.iterator();
        String name = iterator.next();
        System.out.println("Name is: " + name);
        name = iterator.next();
        System.out.println("Name 2 is: " + name);
    }
}
