package Exercises;

public class Exercise_3 {

    /**
     * #3. Factorial de un número:
     * Descripción: Calcular el factorial de un número.
     * Ejemplo de resultado: Entrada: 5 Salida: 120 (5!)
     * 
     */

    public static void main(String[] args) {

        factorial(5);
        factorial(10);
        factorial(7);

    }

    public static void factorial(int number) {

        /*
         * Recorro un for desde el cero hasta el numero dado
         * tengo que ir multiplicando desde el 1 hasta ese numero
         * Por ejmplo 5 = 1x2x3x4x5
         * 
         */

        int result = 1;

        for (int i = 0; i < number; i++) {
            result = result + (i * result);
        }
        System.out.println(result + " (" + number + "!)");
    }

}
