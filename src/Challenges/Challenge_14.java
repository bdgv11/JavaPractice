/**
 * It checks if a number is an Armstrong number.
 */
package Challenges;

/*
 * Reto #14
 * ¿ES UN NÚMERO DE ARMSTRONG?
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Armstrong (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
 */

public class Challenge_14 {

    public static void main(String[] args) {

        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(225));

    }

    public static boolean isArmstrong(int number) {

        // Getting the length of the number, the total of the number and the string of
        // the number.
        int lengthNumber = String.valueOf(number).length();
        int total = 0;
        String string_number = String.valueOf(number);

        // Checking if the number is negative.
        if (number < 0) {
            return false;
        }

        // Getting the number of digits of the number, and then it is getting the number
        // of each digit
        // and adding it to the total.
        for (int i = 0; i < lengthNumber; i++) {
            int res = Character.digit(string_number.charAt(i), 10);
            total += (int) Math.pow(res, lengthNumber);
        }

        // Checking if the total is equal to the number.
        if (total == number) {
            return true;
        }

        return false;

    }
}
