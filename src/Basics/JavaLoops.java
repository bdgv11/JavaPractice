
package Basics;

public class JavaLoops {
    public static void main(String[] args) {
        int pages = 12;
        for (int i = 1; i <= pages; i++) {
            System.out.println("Number " + i);
        }

        String[] students = { "Bryan", "Montse", "Dani" };
        for (String student : students) {
            System.out.println(student);
        }

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("------");

        do {
            System.out.println(i);
            i--;
        } while (i > 0);

        System.out.println("------");
        int stop = 12;
        for (int x = 1; x <= stop; x++) {
            System.out.println("Number " + x);
            if (x == 4) {
                System.out.println("STOP");
                break;
            }
        }
    }
}
