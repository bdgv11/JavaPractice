
package Basics;
public class JavaMethods {
    public static void main(String[] args) {
        helloWorld();
        helloName("Bryan");
        getSum(3, 5);
        getSum(12, 55);
        printAge("Bryan", 27);
        printAge("Dani", 15);
        getSum(14.5, 22.4);
        System.out.println(square(10));
    }

    // private will let us use just here, on this class
    // void means we don't return anything
    private static void helloWorld() {
        System.out.println("Hello world!");
    }

    private static void helloName(String name) {
        System.out.println("Hello, " + name);
    }

    private static void getSum(int a, int b) {
        System.out.println(a + b);
    }

    private static void getSum(double a, double b) {
        System.out.println(a + b);
    }

    private static void printAge(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }

    private static int square(int number) {
        int result = number * number;
        return result;
    }
}
