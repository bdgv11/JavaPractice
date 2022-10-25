package Challenges;

/*
 * Reto #38
 * BINARIO A DECIMAL
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa se encargue de transformar un número binario a decimal sin utilizar
 * funciones propias del lenguaje que lo hagan directamente.
 *
 */

public class Challenge_38 {
    public static void main(String[] args) {
        challenge38("111110111");
        challenge38("1010101011");
        challenge38("1111111");
        challenge38("00001111");
    }

    public static void challenge38(String binaryNumber) {

        int suma = 0;
        int pot = binaryNumber.length()-1;

        for (int i = 0; i < binaryNumber.length(); i++) {

            Character binaryValue = binaryNumber.charAt(i);
            int potencia = (int) Math.pow(2, pot);
            suma = suma + ( Integer.parseInt(binaryValue.toString())  * potencia);
            pot = pot -1;
            
        }
        System.out.println("El numero binario --" + binaryNumber + "-- en decimal es: " + suma);
    }
}