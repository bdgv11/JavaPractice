package Challenges;

/*
 * Reto #32
 * EL SEGUNDO
 * Dificultad: FÁCIL
 *
 * Enunciado: Dado un listado de números, encuentra el SEGUNDO más grande.
 *
 */

public class Challenge_32 {

    public static void main(String[] args) {

        Integer[] list = { 1, 500, 16, 2, 9, 256, 12, 245, 892, 192, 1599, 6233 };
        challenge_32(list);
    }

    public static void challenge_32(Integer[] list) {

        // Declaring the variables mayor and segundoMayor and initializing them to 0.
        int mayor = 0;
        int segundoMayor = 0;

        // Finding the largest number in the array.
        for (int i = 0; i < list.length; i++) {
            if (list[i] > mayor) {
                mayor = list[i];
            }
        }

        // Finding the second largest number in the array.
        for (int j = 0; j < list.length; j++) {

            if (segundoMayor < list[j] && list[j] < mayor) {
                segundoMayor = list[j];
            }
        }

        // Printing the largest and second largest numbers in the array.
        System.out.println("Mayor: " + mayor);
        System.out.println("Segundo mayor: " + segundoMayor);
    }
}