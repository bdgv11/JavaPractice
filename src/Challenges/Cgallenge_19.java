package Challenges;

/*
 * Reto #19
 * CONVERSOR TIEMPO
 * Dificultad: FACIL
 *
 * Enunciado: Crea una función que reciba días, horas, minutos y segundos (como enteros) y retorne su resultado en milisegundos.
 *
 */

public class Cgallenge_19 {

    public static void main(String[] args) {
        System.out.println(challenge_19(2, 5, 45, 14) + "\n");
        System.out.println(challenge_19(0, 0, 0, 10) + "\n");
        System.out.println(challenge_19(200000, 19, 12, 10) + "\n");
        System.out.println(challenge_19(1, 3, -34, 10) + "\n");
    }

    public static int challenge_19(int day, int hour, int minutes, int seconds) {

        int secondInMs = 1000;
        int minuteInMs = 60000;
        int hourInMs = 3600000;
        int dayInMs = 86400000;

        int total = (int) ((day * dayInMs) + (hour * hourInMs) + (minutes * minuteInMs)
                + (seconds * secondInMs));

        System.out.println(day + " dias en milisegundos son: " + (day * dayInMs));
        System.out.println(hour + " horas en milisegundos son: " + (hour * hourInMs));
        System.out.println(minutes + " minutes en milisegundos son: " + (minutes * minuteInMs));
        System.out.println(seconds + " segundos en milisegundos son: " + (seconds * secondInMs));

        return total;

    }

}
