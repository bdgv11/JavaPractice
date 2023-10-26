package Exercises;

public class Exercise_8 {
    /*
     * #8. Palíndromo:
     * Descripción: Determinar si una cadena es un palíndromo o no.
     * Ejemplo de resultado: Entrada: "racecar" Salida: Es un palíndromo
     */

    public static void main(String[] args) {
        isPalindromo("racecar");
        isPalindromo("Bryan");
        isPalindromo("Oso");
        isPalindromo("Oso baboso");
        isPalindromo("olo ");

    }

    public static void isPalindromo(String text) {

        /*
         * Obtengo un texto,
         * debo recorrerlo al derecho y alrevez e ir comparando si en cada valor de la
         * iteracion son iguales
         */
        String cleanText = text.replaceAll("\\s", "");
        String reversedString = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                reversedString = reversedString + text.charAt(i);
            }

            

        }

        System.out.println("\nComparando el texto: " + cleanText + " con "
                + reversedString);

        System.out
                .println(cleanText.equalsIgnoreCase(reversedString) ? cleanText + " es palindromo"
                        : cleanText + " NO es palindromo" + "\n");

                        
    }
}
