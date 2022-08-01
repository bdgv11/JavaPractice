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

// TODO Complete this!
public class Challenge_12 {

    public static void main(String[] args) {
        System.out.println(challenge_12("Ana lleva al oso la avellana"));
    }

    /**
     * It takes a string, converts it to lowercase, then reverses it and compares it to the original
     * string
     * 
     * @param text the text to be checked
     * @return A boolean value.
     */
    public static boolean challenge_12(String text) {
        text = text.toLowerCase();
        String textResult = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            textResult += text.charAt(i);
        }

        if (text == textResult) {
            return true;
        } else {
            return false;
        }
    }
}