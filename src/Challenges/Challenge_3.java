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

    private static void challenge3() {
        for (int i = 1; i < 100; i++) {
            if(prime(i)){
                System.out.println(i + " es primo");
            }
        }
    }

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
