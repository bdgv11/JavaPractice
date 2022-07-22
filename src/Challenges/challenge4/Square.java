package Challenges.challenge4;

public class Square implements Polygon {

    double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public void printArea() {
        System.out.println("El area del cuadrado es: " + getArea());        
    }
    
}
