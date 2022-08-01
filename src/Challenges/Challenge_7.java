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

        String[] text = { "bryan", "daVId", "daniel", "BRYAN", "Josue", "DANiel", "Bryan", "josue", "daniel",
                "Montserrat" };
        challenge_7(text);
    }

    /**
     * It loops through the array, and for each element, it loops through the array again to check if
     * the element is equal to any other element in the array. If it is, it checks if the element is
     * equal to any other element in the array before it. If it is, it skips the element. If it isn't,
     * it prints the element and the number of times it appears in the array
     * 
     * @param text an array of strings to look through
     */
    public static void challenge_7(String[] text) {
        int nameCount = 0;

        for (int i = 0; i < text.length; i++) {

            boolean flag = false;

            for (int j = 0; j < text.length; j++) {

                if (text[i].equalsIgnoreCase(text[j]) && j < i) {
                    flag = true;
                    break;
                }

                if (text[i].equalsIgnoreCase(text[j]) && flag == false) {
                    nameCount += 1;
                }
            }
            if (nameCount > 0) {
                System.out.println("Count for " + text[i].toUpperCase() + " is : " + nameCount);
                nameCount = 0;
            }
        }

    }
}