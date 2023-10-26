package OOP.Homework7;

public class Car {

    private String make;
    private String model;
    private int miles;
    private int price;
    private int doors;

    public Car(String make, String model, int miles, int price, int doors) {
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.price = price;
        this.doors = doors;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMiles() {
        return miles;
    }

    public int getPrice() {
        return price;
    }

    public int getDoors() {
        return doors;
    }

    public void drive(int miles) {
        this.miles = this.miles + miles;
        System.out.println(make + " " + model + " " + " drove for " + miles + " miles.");
    }

    public void forSale(int price) {
        this.price = price;
        System.out.println("Selling " + make + " " + model + " for $" + price);
    }

}
