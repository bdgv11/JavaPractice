package Exercises;

public class Exercise_1 {

    /**
     *
     * #1. Inversión de cadena:
     * Descripción: Invertir una cadena dada.
     * Ejemplo de resultado: Entrada: "hola" Salida: "aloh"
     *
     */

    public static void main(String[] args) {

        invertString("hola");
        invertString("Bryan");
        invertString("Testing");
        invertString("Costa Rica");

    }

    public static void invertString(String text) {

        // Recibo un string
        // Hacer un ciclo for para recorrerlo
        // Guardar cada letra en otro string pero alrevez
        //

        String textInverted = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            textInverted = textInverted + text.charAt(i);
        }
        System.out.println("La palabra '" + text + "' invertida seria: " + textInverted);
    }
}