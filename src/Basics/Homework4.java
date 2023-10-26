package Basics;

public class Homework4 {
    public static void main(String[] args) {
        // Change the letter 'o' to 0.
        String str = "Hello world!";
        String newPhrase = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                newPhrase = newPhrase + 0;
            } else {
                newPhrase = newPhrase + str.charAt(i);
            }
        }
        System.out.println(newPhrase);
    }
}
