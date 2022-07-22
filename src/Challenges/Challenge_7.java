package Challenges;

/*
 * Reto #7
 * CONTANDO PALABRAS
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 */

public class Challenge_7 {

    public static void main(String[] args) {

        String[] text = { "bryan", "daVId", "daniel", "BRYAN", "Josue", "DANiel", "Bryan", "josue", "daniel" };
        challenge_7(text);
    }

    public static void challenge_7(String[] text) {
        int nameCount = 0;
        int arrayLength = text.length;

        for (int i = 0; i < text.length; i++) {

            for (int j = 0; j < text.length; j++) {

                if (text[i].equalsIgnoreCase(text[j])) {
                    nameCount += 1;
                }
            }
            System.out.println("Count for " + text[i] + " is : " + nameCount);
            nameCount = 0;
        }
        System.out.println("Count name: " + arrayLength);
    }
}