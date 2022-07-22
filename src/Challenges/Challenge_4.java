package Challenges;

import Challenges.challenge4.Polygon;
import Challenges.challenge4.Rectangle;
import Challenges.challenge4.Square;
import Challenges.challenge4.Triangle;

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar 
 * el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

public class Challenge_4 {

    public static void main(String[] args) {
        Polygon tri = new Triangle(10.0, 5.0);
        tri.printArea();
        Polygon square = new Square(4.0);
        square.printArea();
        Polygon rectangle = new Rectangle(5.0, 7.0);
        rectangle.printArea();
    }
}