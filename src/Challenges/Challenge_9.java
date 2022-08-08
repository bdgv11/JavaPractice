/**
 * It's a mess
 */
package Challenges;

import java.util.HashMap;

/*
 * Reto #9
 * CÓDIGO MORSE
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "-", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 */

public class Challenge_9 {

    public static void main(String[] args) {
        convertToMorse("Buenas tardes mi nombre es Bryan Guzman y son QA Engineer");
        convertToText(
                ".--. .-. ..- . -... .- / -.. . / - . -..- - --- / .- / -- --- .-. ... . / --- / -. --- / ... . .-.-.");
    }

    // Methods to get text characters in order to convert to morse
    public static void convertToMorse(String text) {
        String newArray = text.toLowerCase();
        String newPhrase = "";
        for (int i = 0; i < newArray.length(); i++) {
            newPhrase += getFromText(newArray.charAt(i));
        }
        System.out.println(newPhrase);
    }

    public static String getFromText(char text) {

        String value = "";

        HashMap<String, String> map = new HashMap<>();

        map.put("a", ".- ");
        map.put("b", "-... ");
        map.put("c", "-.-. ");
        map.put("ch", "---- ");
        map.put("d", "-.. ");
        map.put("e", ". ");
        map.put("f", "..-. ");
        map.put("g", "--. ");
        map.put("h", ".... ");
        map.put("i", ".. ");
        map.put("j", ".--- ");
        map.put("k", "-.- ");
        map.put("l", ".-.. ");
        map.put("m", "-- ");
        map.put("n", "-. ");
        map.put("ñ", "--.-- ");
        map.put("o", "--- ");
        map.put("p", ".--. ");
        map.put("q", "--.- ");
        map.put("r", ".-. ");
        map.put("s", "... ");
        map.put("t", "- ");
        map.put("u", "..- ");
        map.put("v", "...- ");
        map.put("w", ".-- ");
        map.put("x", "-..- ");
        map.put("y", "-.-- ");
        map.put("z", "--.. ");
        map.put(" ", " / ");

        String str = String.valueOf(text);
        value = map.get(str);

        return value;
    }

    // Methods to get morse characters in order to convert to normal text
    public static void convertToText(String text) {

        String textToArray = text.toLowerCase();
        String newPhrase = "";
        String finalText = "";

        for (int i = 0; i < textToArray.length(); i++) {

            if (textToArray.charAt(i) == ' ') {
                finalText += getFromMorse(newPhrase);
                newPhrase = "";
            } else {
                newPhrase += textToArray.charAt(i);
            }

        }
        System.out.println(finalText);
    }

    public static String getFromMorse(String text) {

        String value = "";

        HashMap<String, String> map = new HashMap<>();

        map.put(".-", "a");
        map.put("-...", "b");
        map.put("-.-.", "c");
        map.put("----", "ch");
        map.put("-..", "d");
        map.put(".", "e");
        map.put("..-.", "f");
        map.put("--.", "g");
        map.put("....", "h");
        map.put("..", "i");
        map.put(".---", "j");
        map.put("-.-", "k");
        map.put(".-..", "l");
        map.put("--", "m");
        map.put("-.", "n");
        map.put("--.--", "ñ");
        map.put("---", "o");
        map.put(".--.", "p");
        map.put("--.-", "q");
        map.put(".-.", "r");
        map.put("...", "s");
        map.put("-", "t");
        map.put("..-", "u");
        map.put("...-", "v");
        map.put(".--", "w");
        map.put("-..-", "x");
        map.put("-.--", "y");
        map.put("--..", "z");
        map.put("/", " ");
        map.put("", "");

        String str = String.valueOf(text);
        value = map.get(str);

        return value;

    }
}