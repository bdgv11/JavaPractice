package Challenges;

/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 *
 */

public class Challenge_12 {

    public static void main(String[] args) {
        System.out.println(challenge_12("Ana lleva al oso la avellana"));
        System.out.println(challenge_12("negative test"));
        System.out.println(challenge_12("ANA"));
    }

    /**
     * It takes a string, converts it to lowercase, then reverses it and compares it
     * to the original
     * string
     * 
     * @param text the text to be checked
     * @return A boolean value.
     */
    public static boolean challenge_12(String text) {

        // Taking the text, converting it to lowercase, then splitting it into an array
        // of strings,
        // then it is creating two empty strings, one for the converted text and one for
        // the reversed text.
        // Then it is creating a boolean variable and assigning it the value of true.
        String[] textWithoutSpaces = text.toLowerCase().split("\\ ");
        String textConverted = "";
        String textReversed = "";
        boolean flag = true;

        // Taking the array of strings and converting it into a single string.
        for (int i = 0; i < textWithoutSpaces.length; i++) {
            textConverted += textWithoutSpaces[i];
        }

        // Taking the string and reversing it.
        for (int i = textConverted.length() - 1; i >= 0; i--) {
            textReversed += textConverted.charAt(i);
        }

        // Printing the converted text and the reversed text. Then it is checking if the converted text
        // is equal to the reversed text. If it is not, it is assigning the value of false to the flag
        // variable. Finally, it is returning the value of the flag variable.
        System.out.println("Text converted: " + textConverted + " y el reversed es: " + textReversed);

        if (!textConverted.equals(textReversed)) {
            flag = false;
        }

        return flag;
    }
}