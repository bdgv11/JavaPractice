package Challenges;

/*
 * Reto #8
 * DECIMAL A BINARIO
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

public class Challenge_8 {

    public static void main(String[] args) {
        convertToBinary(155);
    }

   /**
    * It converts a decimal number to binary.
    * 
    * @param number The number that will be converted to binary.
    */
    public static void convertToBinary(int number) {

        String binary = "";
        String newBinary = "";

        while (number != 0) {
            if (number % 2 == 0) { // PAR
                binary = binary + "0";
                number = number / 2;
            } else { // I M P A R
                binary = binary + "1";
                number = number / 2;
            }
        }
        for (int i = binary.length() - 1; i >= 0; i--) {
            newBinary += binary.charAt(i);
        }
        System.out.println(newBinary);
    }
}