package Challenges;

import java.util.ArrayList;

/*
 * Reto #34
 * LOS NÚMEROS PERDIDOS
 * Dificultad: FÁCIL
 *
 * Enunciado: Dado un array de enteros ordenado y sin repetidos, crea una función que calcule
 * y retorne todos los que faltan entre el mayor y el menor.
 * - Lanza un error si el array de entrada no es correcto.
 *
 */

// TODO complete this!

public class Challenge_34 {

    public static void main(String[] args) {

        Integer list[] = { 1, 2, 4, 7, 9 };
        challenge34(list);

    }

    public static void challenge34(Integer[] list) {

        int menor = list[0];
        int mayor = list[list.length - 1];

        ArrayList<Integer> faltan = new ArrayList<>();

        for (int i = menor; i <= mayor; i++) {

            if (!containsNumber(i, list)) {
                faltan.add(i);
            }
        }

        System.out.println("Los numeros que faltan son: ");
        for (Integer valor : faltan) {
            System.out.println(valor);
        }
    }

    public static boolean containsNumber(int number, Integer[] list) {

        boolean bandera = false;
        for (int j = 0; j < list.length; j++) {
            if (number == list[j]) {
                bandera = true;
            }
        }

        return bandera;
    }
}