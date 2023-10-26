import java.util.ArrayList;
import java.util.HashMap;

public class ListOfMaps {
    public static void main(String[] args) {

        // Student1 , Arthur Morgan, Java, A
        HashMap<String, String> student1 = new HashMap<>();
        student1.put("firstName", "Arthur");
        student1.put("lastName", "Morgan");
        student1.put("language", "Java");
        student1.put("grade", "A");

        HashMap<String, String> student2 = new HashMap<>();
        student2.put("firstName", "John");
        student2.put("lastName", "Marston");
        student2.put("language", "Python");
        student2.put("grade", "A");

        HashMap<String, String> student3 = new HashMap<>();
        student3.put("firstName", "Bill");
        student3.put("lastName", "Williamson");
        student3.put("language", "Javascript");
        student3.put("grade", "B");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        ArrayList<HashMap<String, String>> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

        System.out.println("- - - - - - -");
        System.out.println("\nJust grade A");
        for (HashMap<String, String> student : students) {
            String grade = student.get("grade");
            if (grade.equals("A")) {
                String first = student.get("firstName");
                String last = student.get("lastName");

                System.out.println("Student: " + first + " " + last + " got an A.");
            }
        }
        System.out.println("\nAll grades");
        for (HashMap<String, String> student : students) {
            System.out.println("Student: " + student.get("firstName") + " " + student.get("lastName") + " got an "
                    + student.get("grade"));
        }
    }
}
