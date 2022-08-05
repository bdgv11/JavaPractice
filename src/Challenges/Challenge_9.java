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

// TODO Fix this!
public class Challenge_9 {

    public static void main(String[] args) {
        convertToMorse("Hello my name is Bryan");
    }

    public static void convertToMorse(String text) {
        String newArray = text.toLowerCase();
        String newPhrase = "";
        for (int i = 0; i < newArray.length(); i++) {
            newPhrase += getTextToMorse(newArray.charAt(i));
        }
        System.out.println(newPhrase);
    }

    public static String getTextToMorse(char text) {

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
}