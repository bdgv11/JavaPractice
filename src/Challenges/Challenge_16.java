package Challenges;

/*
 * Reto #16
 * EN MAYÚSCULA
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 */

public class Challenge_16 {

    public static void main(String[] args) {
        challenge_16("costa rica england france praga mexico spain");
        challenge_16("this is a test in order to print the first letter in uppercase");
        challenge_16("1, 2, 2*");
        challenge_16("reto numero 16 de moure dev");
    }

    public static void challenge_16(String text) {

        if (text != "") {

            String[] list = text.split("\\ ");
            String newPhrase = "";

            // Iterating over the list of words and for each word it is getting the first
            // letter, converting it to
            // a string, converting it to uppercase and then adding it to the new word.
            for (String element : list) {

                char firstLetter = element.charAt(0);

                String upperLetter = String.valueOf(firstLetter);

                String newWord = upperLetter.toUpperCase() + element.substring(1);

                newPhrase += newWord + " ";
            }

            System.out.println(newPhrase);

        }
    }
}