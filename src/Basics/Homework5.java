
package Basics;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println(getAverage(15, 134.5, 149));
        System.out.println(getAverage(15, 15, 15));
    }

    private static double getAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
