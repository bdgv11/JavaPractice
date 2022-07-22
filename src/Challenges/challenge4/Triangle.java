package Challenges.challenge4;

public class Triangle implements Polygon {

    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void printArea() {
        System.out.println("El area del triangulo es: " + getArea());
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
