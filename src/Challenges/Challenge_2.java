package Challenges;

/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 */

public class Challenge_2 {
    public static void main(String[] args) {
        challenge2();
    }

    /**
     * It prints the first 50 numbers in the Fibonacci sequence
     */
    static void challenge2() {
        long n1 = 0;
        long n2 = 1;
        long fib = 0;

        for (int i = 0; i <= 50; i++) {
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
            System.out.println(fib);
        }
    }
}