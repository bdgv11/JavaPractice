package Challenges;

/*
 * Reto #31
 * AÑOS BISIESTOS
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado.
 * - Utiliza el menor número de líneas para resolver el ejercicio.
 */

public class Challenge_31 {

    public static void main(String[] args) {
        challenge_31(2022);
    }

    public static void challenge_31(int year) {

        // Dicho de otro modo, son bisiestos todos los años divisibles por 4, excluyendo
        // los que sean divisibles por 100, pero no los que sean divisibles por 400.

        int count = 1;
        for (int i = year; count <= 30; i++) {

            if ((i % 4 == 0) && ((i % 100 != 0) || (i % 400 == 0))) {
                System.out.println(count + ":" + i + " es bisiesto");
                count++;
            }
        }
    }
}
