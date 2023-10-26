package Exercises;

import java.util.ArrayList;

public class Exercise_4 {

    /*
     * #4. Fibonacci:
     * Descripción: Generar la secuencia de Fibonacci hasta un número específico.
     * Ejemplo de resultado: N=10 Salida: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
     */

    public static void main(String[] args) {
        fibonacci(10);
    }

    public static void fibonacci(int number) {

        /*
         * Voy a recorrer con un for del 0 hasta el Numero dado
         * necesito el numeroAnterior, numeroActual, resultado creo e ir agregandolo a
         * un array puede ser
         */

        int anterior = 0;
        int actual = 1;
        int resultado = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < number; i++) {

            // 0-> an0+ac1,r1
            // 1-> an1+ac1,r2
            // 2-> an1+act2,r3
            // 3-> an2+act3,r5

            resultado = anterior + actual;
            anterior = actual;
            actual = resultado;

            arrayList.add(resultado);

        }
        System.out.println(arrayList);
    }
}
