
package Basics;
public class Homework1 {
    public static void main(String[] args) {

        int number = 24;

        if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        } else if (number <= 10) {
            System.out.println("Small");
        } else if (number < 100) {
            if (number == 23) {
                System.out.println("Jordan");
            } else {
                System.out.println("Less than 100");
            }
        } else if (number >= 100) {
            System.out.println("Too big");
        }
    }
}
