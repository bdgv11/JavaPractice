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

 // TODO Complete this!

public class Challenge_11 {

    public static void main(String[] args) {
        challenge_11("brais", "moure");
        challenge_11("Me gusta Objective-C", "Me gusta Swift");
    }

    public static void challenge_11(String str1, String str2) {

        char[] charStr1 = str1.toLowerCase().toCharArray();
        String out1 = "";
        char[] charStr2 = str2.toLowerCase().toCharArray();
        String out2 = "";

        for (int i = 0; i < charStr1.length; i++) {
            for (int j = 0; j < charStr2.length; j++) {
                if (charStr1[i] != charStr2[j]) {
                    out1 = out1 + charStr1[i];
                }
            }
        }
        System.out.println(charStr1);
        System.out.println(out2);
    }
}