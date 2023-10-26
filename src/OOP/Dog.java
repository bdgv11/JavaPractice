package OOP;
public class Dog extends Animal {

    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void goodBoy() {
        System.out.println(name + " who is a good boy?");
    }

}
