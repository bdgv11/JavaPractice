package Challenges;

/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 *
 */

public class Challenge_6 {

    public static void main(String[] args) {
        reverseText("Hola Mundo");
    }

    static void reverseText(String text) {

        char [] charArray = text.toCharArray();
        char [] reverse;

        for (int i = 0; i < charArray.length -1; i++) {
            System.out.println(charArray[i]);
        }
    }
}