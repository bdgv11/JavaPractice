package Challenges.challenge4;

public class Rectangle implements Polygon {

    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void printArea() {
        System.out.println("El area del rectangulo es: " + getArea());

    }

}
