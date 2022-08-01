package Challenges;

/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 */

public class Challenge_3 {

    public static void main(String[] args) {
        challenge3();
    }

    /**
     * It prints all the prime numbers between 1 and 100
     */
    private static void challenge3() {
        for (int i = 1; i < 100; i++) {
            if(prime(i)){
                System.out.println(i + " es primo");
            }
        }
    }

    /**
     * If the number is less than or equal to 1, it's not prime. Otherwise, if the number is divisible
     * by any number between 2 and itself, it's not prime. Otherwise, it is prime
     * 
     * @param num The number to be checked for primality.
     * @return A boolean value.
     */
    private static boolean prime(int num){
        if(num <= 1){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }       
        return true;        
    }
}
