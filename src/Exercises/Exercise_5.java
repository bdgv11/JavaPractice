package Exercises;

public class Exercise_5 {

    /*
     * #5. Determinar números primos:
     * Descripción: Determinar si un número dado es primo o no.
     * Ejemplo de resultado: Entrada: 7 Salida: Es primo
     */
    public static void main(String[] args) {
        isPrimo(7);
        isPrimo(24);
        isPrimo(11);
        isPrimo(1469);
        isPrimo(55);
        isPrimo(245);
        isPrimo(99);
        isPrimo(43);
        isPrimo(631);

    }

    public static void isPrimo(int number) {

        // Los números primos son aquellos que únicamente pueden dividirse por uno o por
        // su mismo número.

        boolean isNumberPrimo = true;

        for (int i = 2; i < 100; i++) {
            if (number % i == 0 && i != 1 && i != number) {
                isNumberPrimo = false;
            }
        }
        System.out.println("El numero " + number + " is " + isNumberPrimo);
    }
}
