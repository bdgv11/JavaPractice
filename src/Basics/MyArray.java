package Basics;
public class MyArray {
    public static void main(String[] args) {
        String[] students = { "Bryan", "Montse", "Daniel" };
        int[] numbers = { 55, 34, 78 };

        System.out.println("Student name: " + students[0]);

        students[0] = "Test";
        System.out.println("Student name: " + students[0]);

        System.out.println("There are " + students.length + " in the class");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Position " + i + " with name " + students[i]);

        }
    }
}
