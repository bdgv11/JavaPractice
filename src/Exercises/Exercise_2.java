package Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise_2 {

    /**
     * #2. Conteo de caracteres:
     * Descripción: Contar la cantidad de veces que aparece cada carácter en una
     * cadena.
     * Ejemplo de resultado: Entrada: "hello" Salida: {'h': 1, 'e': 1, 'l': 2, 'o':
     * 1}
     */

    public static void main(String[] args) {
        charactersCount("hello");
        charactersCount("paracutimiricuaro");
        charactersCount("futbolamericano");
    }

    public static void charactersCount(String text) {

        // Primero debo recorrer con un ciclo la palabra
        // Debo tener una variable para ir contandolas y ponerla en 0 cuando se termine
        // de recorrer toda la palabra

        // Debo crear un HashMap para ir guardando los key : value, que seria la letra y
        // la cantidad e imprimir

        int count = 0;
        char target;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {

            target = text.charAt(i);

            for (int j = 0; j < text.length(); j++) {
                if (target == text.charAt(j)) {
                    count = count + 1;
                }
                map.put(target, count);
            }
            count = 0;
        }
        System.out.println("Word: " + text + "\n" + map);
    }
}