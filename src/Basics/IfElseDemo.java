
package Basics;

public class IfElseDemo {
    public static void main(String[] args) {
        int x = 10;
        boolean isTrue = x > 10;
        if (isTrue) {
            System.out.println("Yes! " + x + " is more than 10.");
        } else if (x == 10) {
            System.out.println(x + " is 10!!");
        } else {
            System.out.println("X is less than 10");
        }

        int time = 1900;
        boolean cold = true;

        if (time < 1200) {
            System.out.println("Good morning");
        } else if (time >= 1200 && time <= 1800) {
            System.out.println("Good afternoon");
        } else {
            if (cold) {
                System.out.println("It's cold!");
            }
            System.out.println("Good evening!");
        }
    }
}
