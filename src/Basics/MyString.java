package Basics;

public class MyString {
    public static void main(String[] args) {
        String phraseToUse = "Hello World, Bryan is practicing Java again.";
        System.out.println(phraseToUse);

        int stringLength = phraseToUse.length();
        System.out.println("Length of word: " + stringLength);

        String helloUp = phraseToUse.toUpperCase();
        String helloLow = phraseToUse.toLowerCase();

        System.out.println(helloUp);
        System.out.println(helloLow);
        System.out.println(helloUp + " " + helloLow);
        System.out.println(phraseToUse + " length: " + stringLength);

        String movie = "My favorite movie is \n\"Home Alone\"";
        System.out.println(movie);
    }
}
