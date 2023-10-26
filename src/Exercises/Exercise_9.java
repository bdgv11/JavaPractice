package Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise_9 {

    public static void main(String[] args) {

        // exercise9(2, 3);

        int[] array11 = { 1, 2, 3, 4, 5 };
        // exercise11(array11);

        int[] array12 = { 1, 2, 2, 3, 4, 4, 5 };
        // exercise12(array12);

        // exercise13(145980);

        int[] arrayTwoSum = { 3, 2, 4 };
        twoSum(arrayTwoSum, 6);

        // System.out.println(isPalindrome(101));
        int[] arraySearch = { 1, 3, 5, 6 };
        System.out.println(searchInsert(arraySearch, 5));
    }

    public static void exercise9(int base, int pot) {

        /*
         * #9. Cálculo de potencia:
         * Descripción: Calcular la potencia de un número.
         * Ejemplo de resultado: Base: 2, Exponente: 3 Salida: 8 (2^3)
         */

        int result = 1;
        for (int i = 1; i <= pot; i++) {
            result *= base;
        }
        System.out.println(result + " " + "(" + base + "^" + pot + ")");
    }

    public static void exercise10() {

        /*
         * #10. Validación de paréntesis:
         * Descripción: Determinar si una expresión matemática tiene paréntesis
         * correctamente balanceados.
         * Ejemplo de resultado: Entrada: "(a + b) * (c - d)" Salida: Paréntesis
         * balanceados
         */

    }

    public static void exercise11(int[] array) {
        /*
         * #11. Suma de elementos de un array:
         * Descripción: Calcular la suma de todos los elementos en un array.
         * Ejemplo de resultado: Entrada: [1, 2, 3, 4, 5] Salida: 15
         */

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        System.out.println("Total de los elementos del array es: " + result);

    }

    public static void exercise12(int[] array) {
        /*
         * #12. Eliminación de duplicados:
         * Descripción: Eliminar elementos duplicados de un array.
         * Ejemplo de resultado: Entrada: [1, 2, 2, 3, 4, 4, 5] Salida: [1, 2, 3, 4, 5]
         */

        // Recibo el array
        // Debo recorrer el array luego ir comparando si existe dentro del final, si no
        // existe agregarlo y ya

        ArrayList<Integer> arrayFinal = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                arrayFinal.add(array[i]);
            }

            if (!arrayFinal.contains(array[i])) {
                arrayFinal.add(array[i]);
            }
        }
        System.out.println(arrayFinal);
    }

    public static void exercise13(int cambio) {
        /*
         * #13. Cambio de monedas:
         * Descripción: Calcular la cantidad mínima de monedas para dar un cambio
         * específico.
         * Ejemplo de resultado: Cambio: 675 colones (moneda de Costa Rica) Salida: 1
         * moneda de 500 colones, 1 moneda de 100 colones, 1 moneda de 50 colones, 1
         * moneda de 25 colones
         */

        // - Tengo que listar todas las y monedas/billetes que hay en CR 20000, 10000,
        // 5000, 2000, 1000, 500, 100, 50, 25, 10, 5
        // - Al monto que me dan ir restandole de la moneda/billete mas alta a la mas
        // baja e ir
        // calculando lo que queda
        // - Dar el resultado de cuantas se ocupan

        int veinteMilCant = 0;
        int diezMilCant = 0;
        int cincoMilCant = 0;
        int dosMilCant = 0;
        int milCant = 0;
        int quinientosCant = 0;
        int cienCant = 0;
        int cincuentaCant = 0;
        int veintiCincoCant = 0;
        int diezCant = 0;
        int cincoCant = 0;

        int montoActual = 0;

        HashMap<Integer, Integer> dinero = new HashMap<>();
        dinero.put(20000, veinteMilCant);
        dinero.put(10000, diezMilCant);
        dinero.put(5000, cincoMilCant);
        dinero.put(2000, dosMilCant);
        dinero.put(1000, milCant);
        dinero.put(500, quinientosCant);
        dinero.put(100, cienCant);
        dinero.put(50, cincuentaCant);
        dinero.put(25, veintiCincoCant);
        dinero.put(10, diezCant);
        dinero.put(5, cincoCant);

        montoActual = cambio;

        while (montoActual > 0) {

            if (montoActual >= 20000) {
                veinteMilCant += 1;
                dinero.replace(20000, veinteMilCant);
                montoActual -= 20000;
            }

            if (montoActual >= 10000 && montoActual < 20000) {
                diezMilCant += 1;
                dinero.replace(10000, diezMilCant);
                montoActual -= 10000;
            }

            if (montoActual >= 5000 && montoActual < 10000) {
                cincoMilCant += 1;
                dinero.replace(5000, cincoMilCant);
                montoActual -= 5000;
            }

            if (montoActual >= 2000 && montoActual < 5000) {
                dosMilCant += 1;
                dinero.replace(2000, dosMilCant);
                montoActual -= 2000;
            }

            if (montoActual >= 1000 && montoActual < 2000) {
                milCant += 1;
                dinero.replace(1000, milCant);
                montoActual -= 1000;
            }

            if (montoActual >= 500 && montoActual < 1000) {
                quinientosCant += 1;
                dinero.replace(500, quinientosCant);
                montoActual -= 500;
            }

            if (montoActual >= 100 && montoActual < 500) {
                cienCant += 1;
                dinero.replace(100, cienCant);
                montoActual -= 100;
            }

            if (montoActual >= 50 && montoActual < 100) {
                cincuentaCant += 1;
                dinero.replace(50, cincuentaCant);
                montoActual -= 50;
            }

            if (montoActual >= 25 && montoActual < 50) {
                veintiCincoCant += 1;
                dinero.replace(25, veintiCincoCant);
                montoActual -= 25;
            }

            if (montoActual >= 10 && montoActual < 25) {
                diezCant += 1;
                dinero.replace(10, diezCant);
                montoActual -= 10;
            }

            if (montoActual >= 5 && montoActual < 10) {
                cincoCant += 1;
                dinero.replace(5, cincoCant);
                montoActual -= 5;
            }

        }

        System.out.println("\nPara el monto '" + cambio + "' se necesita:");

        for (Map.Entry<Integer, Integer> entry : dinero.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(
                        entry.getKey() < 1000 ? "Necesita " + entry.getValue() + " monedas de " + entry.getKey()
                                : "Necesita " + entry.getValue() + " billetes de " + entry.getKey());
            }
        }
    }

    public static void exercise14() {
        /*
         * #14. Árbol binario:
         * Descripción: Implementar un árbol binario y realizar operaciones como
         * inserción, búsqueda y eliminación.
         * Ejemplo de resultado: Operaciones de inserción, búsqueda y eliminación en un
         * árbol binario.
         */
    }

    public static void exercise15() {
        /*
         * 
         * #15. Manejo de excepciones:
         * Descripción: Escribir un programa que maneje excepciones y proporcione
         * mensajes de error descriptivos.
         * Ejemplo de resultado: Manejo de excepciones para errores específicos y
         * mensajes personalizados.
         */
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] out = new int[2];
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.println("YEAHHHH\n" + i + "," + j);

                    out[0] = i;
                    out[1] = j;
                    System.out.println(out);

                }
            }
        }
        return out;
    }

    public static boolean isPalindrome(int x) {

        String stringNumber = String.valueOf(x);
        String reversedString = "";

        for (int i = stringNumber.length() - 1; i >= 0; i--) {
            reversedString += stringNumber.charAt(i);
        }

        // System.out.println(reversedString);
        // System.out.println(x);

        return reversedString.equals(stringNumber) ? true : false;

    }

    public static int searchInsert(int[] nums, int target) {

        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < target && nums[i + 1] >= target) {
                System.out.println("Aca es!!" + i);
                result = i + 1;
                break;
            }
        }

        if (nums[nums.length - 1] < target) {
            result = nums.length;
            System.out.println("Aca es al final!!");
        }

        return result;
    }

}
