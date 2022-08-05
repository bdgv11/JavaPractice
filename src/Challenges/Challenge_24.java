package Challenges;

/*
 * Reto #24
 * ITERATION MASTER
 * Dificultad: FÁCIL
 *
 * Enunciado: Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
 * ¿De cuántas maneras eres capaz de hacerlo? Crea el código para cada una de ellas.
 *
 */

public class Challenge_24 {

    public static void main(String[] args) {

        // Using for loop
        System.out.println("--*Using FOR loop*--");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // Using while loop
        System.out.println("--*Using WHILE loop*--");
        int n = 1;
        while (n <= 100) {
            System.out.println(n);
            n++;
        }
    }
}