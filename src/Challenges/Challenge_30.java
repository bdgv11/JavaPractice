package Challenges;

/*
 * Reto #30
 * MARCO DE PALABRAS
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un texto y muestre cada palabra en una línea, formando
 * un marco rectangular de asteriscos.
 * - ¿Qué te parece el reto? Se vería así:
 *   **********
 *   * ¿Qué   *
 *   * te     *
 *   * parece *
 *   * el     *
 *   * reto?  *
 *   **********
 */

public class Challenge_30 {

    public static void main(String[] args) {
        convertText("Que te parece el reto?");
        convertText("Este es una prueba de un reto de Moure Dev");
        convertText("Mi nombre es Bryan Guzman y soy QA Engineer");
    }

    public static void convertText(String text) {

        // Splitting the text into an array of strings.
        String[] textArray = text.split("\\ ");
        String mayor = "";

        // Finding the longest word in the array.
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].length() > mayor.length()) {
                mayor = textArray[i];
            }
        }

        String addAster = "*";
        int mayorLength = mayor.length() + 4;

        // Printing the top and bottom of the box.
        for (int i = 0; i < mayorLength; i++) {
            System.out.print(addAster);
        }
        System.out.println();

        // Printing the words in the array.
        for (int j = 0; j < textArray.length; j++) {
            int space = (mayorLength - textArray[j].length()) - 3;
            String spaceTotal = textArray[j] + getSpace(space);
            System.out.println(addAster + " " + spaceTotal + addAster);
        }

        // Printing the top and bottom of the box.
        for (int i = 0; i < mayorLength; i++) {
            System.out.print(addAster);
        }

        System.out.println();
    }

    public static String getSpace(int space) {

        // Creating a string of spaces.
        String spaces = " ";
        String value = "";
        for (int i = 0; i < space; i++) {
            value = value + spaces;
        }
        return value;
    }
}