package Challenges;

import java.text.DecimalFormat;

/*
 * Reto #41
 * LA LEY DE OHM
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que calcule el valor del parámetro perdido correspondiente a la ley de Ohm.
 * - Enviaremos a la función 2 de los 3 parámetros (V, R, I), y retornará el valor del tercero (redondeado a 2 decimales).
 * - Si los parámetros son incorrectos o insuficientes, la función retornará la cadena de texto "Invalid values".
 * 
 */

public class Challenge_41 {

    public static void main(String[] args) {
        challenge41("", "5", "0.25");
        challenge41("12", "100", "");
        challenge41("220", "", "10");
        challenge41("", "", "10");
    }

    // E = e VOLTAGE
    // I = i CORRIENTE
    // R = r RESISTENCIA
    public static void challenge41(String e, String r, String i) {

        Double E;
        Double I;
        Double R;

        int count = 0;

        if (e == "") {
            count++;
        }
        if (i == "") {
            count++;
        }
        if (r == "") {
            count++;
        }

        DecimalFormat formato = new DecimalFormat("#.00");

        if (count < 2) {
            if (e == "") {

                I = Double.parseDouble(i);
                R = Double.parseDouble(r);
                E = (I * R);
                System.out.println("El resultado del VOLTAGE es: " + formato.format(E));

            }
            if (r == "") {

                I = Double.parseDouble(i);
                E = Double.parseDouble(e);
                R = E / I;
                System.out.println("El resultado de la RESISTENCIA es: " + formato.format(R));

            }
            if (i == "") {

                E = Double.parseDouble(e);
                R = Double.parseDouble(r);
                I = E / R;

                System.out.println("El resultado de la CORRIENTE es: " + formato.format(I));

            }
        } else {
            System.out.println("Invalid values");
        }

    }

}
