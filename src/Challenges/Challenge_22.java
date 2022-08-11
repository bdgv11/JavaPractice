package Challenges;

import java.util.ArrayList;

/*
 * Reto #22
 * CONJUNTOS
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 */

public class Challenge_22 {

    public static void main(String[] args) {

        String[] array1 = { "461", "2", "David", "3", "4", "100", "234", "7", "456", "15", "hola" };
        String[] array2 = { "1566", "12", "883", "468", "David", "100", "234", "34", "456", "6", "QA" };
        System.out.println("Different values: " + challenge_22(array1, array2, false));
        System.out.println("Same values: " + challenge_22(array1, array2, true));
    }

    public static ArrayList<String> challenge_22(String[] array1, String[] array2, boolean same) {

        if (same) {
            return getSameValues(array1, array2);
        } else {
            return getDifferentValues(array1, array2);
        }

    }

    public static ArrayList<String> getSameValues(String[] array1, String[] array2) {

        ArrayList<String> trueList = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i].equals(array2[j])) {
                    trueList.add(array1[i]);
                }
            }
        }
        return trueList;
    }

    public static ArrayList<String> getDifferentValues(String[] array1, String[] array2) {

        ArrayList<String> arrayComplete = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i].equals(array2[j])) {
                    break;
                }

                if (!array1[1].equals(array2[j]) && j == (array2.length - 1)) {
                    arrayComplete.add(array1[i]);
                }
            }
        }

        for (int i = 0; i < array2.length; i++) {

            for (int j = 0; j < array1.length; j++) {

                if (array2[i].equals(array1[j])) {
                    break;
                }

                if (!array2[1].equals(array1[j]) && j == (array1.length - 1)) {
                    arrayComplete.add(array2[i]);
                }
            }
        }

        return arrayComplete;

    }
}