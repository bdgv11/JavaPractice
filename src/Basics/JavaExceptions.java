
package Basics;

public class JavaExceptions {
    public static void main(String[] args) {
        String[] students = { "bryan", "Montse", "Dani" };

        try {
            System.out.println(students[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Happened  " + e.getMessage());
        }
        System.out.println("Continue");
    }
}
