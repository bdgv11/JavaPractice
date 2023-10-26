
package Basics;
public class HelloWorld {

    public static void main(String[] args) {
        String name = "Bryan";
        System.out.println("Hola " + name);

        boolean flag = false;

        boolean result = flag == false ? flag : true;

        System.out.println(result);
    }
}
