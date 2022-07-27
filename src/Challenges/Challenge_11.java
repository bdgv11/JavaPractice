package Challenges;

/*
 * Reto #11
 * ELIMINANDO CARACTERES
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 *
 */

public class Challenge_11 {

    public static void main(String[] args) {
        challenge_11("brais", "moure");
        challenge_11("Me gusta Objective-C", "Me gusta Swift");
    }

    // Comparing the characters of two strings and printing the characters that are
    // not in the second string.
    public static void challenge_11(String str1, String str2) {

        char[] charStr1 = str1.toLowerCase().toCharArray();
        String out1 = "";
        char[] charStr2 = str2.toLowerCase().toCharArray();
        String out2 = "";

        // Comparing the characters of the first string with the characters of the
        // second string.
        for (int i = 0; i < charStr1.length; i++) {

            for (int j = 0; j < charStr2.length; j++) {

                Boolean flag = false;

                if (charStr1[i] == charStr2[j]) {
                    flag = true;
                    break;
                }

                if (charStr1[i] != charStr2[j] && j == charStr2.length - 1 && flag == false) {
                    out1 = out1 + charStr1[i];
                }
            }
        }

        // Comparing the characters of the second string with the characters of the
        // first string.
        for (int x = 0; x < charStr2.length; x++) {

            for (int k = 0; k < charStr1.length; k++) {

                Boolean flag = false;

                if (charStr2[x] == charStr1[k]) {
                    flag = true;
                    break;
                }

                if (charStr2[x] != charStr1[k] && k == charStr1.length - 1 && flag == false) {
                    out2 = out2 + charStr2[x];
                }

            }

        }

        System.out.println(out1);
        System.out.println(out2);
    }
}