package Exercises;

public class Exercise_7 {

    /*
     * #7. Búsqueda binaria:
     * Descripción: Buscar un elemento en un array ordenado utilizando búsqueda
     * binaria.
     * Ejemplo de resultado: Array: [1, 3, 5, 7, 9] Elemento: 5 Salida: Elemento
     * encontrado en la posición 2
     */

    public static void main(String[] args) {

        int[] array = { 1, 3, 5, 7, 9 };
        searchPosition(array, 5);

        int[] array2 = { 3, 7, 2, 9, 1, 33 };
        searchPosition(array2, 33);

    }

    public static void searchPosition(int[] array, int target) {

        /*
         * tengo un array y un numero target que voy a buscar dentro de ese array, lo q
         * ocupo es la posicion
         */

        for (int i = 0; i < array.length; i++) {

            if (target == array[i]) {
                System.out.println("Target number " + target + " found on " + i + " position.");

            }
        }
    }
}
