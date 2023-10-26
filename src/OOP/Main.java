package OOP;

import OOP.Homework7.Coupe;
import OOP.Homework7.Sedan;

public class Main {
    public static void main(String[] args) {

        /*
         * ClassDemo clDemo = new ClassDemo();
         * clDemo.printNumber();
         * clDemo.printText();
         * 
         * 
         * 
         * 
         * Lamp lampInstance = new Lamp("kitchen");
         * lampInstance.printLightStatus();
         * 
         * lampInstance.lightStatus = true;
         * lampInstance.printLightStatus();
         * 
         * 
         * Programming progInstance = new Programming("Java");
         * 
         * progInstance.learningStatus();
         * progInstance.learningComplete();
         * progInstance.learningStatus();
         * 
         * 
         * Cat cat = new Cat("Tom", "American shorthair");
         * cat.setName("Tobby");
         * 
         * System.out.println("We have a " + cat.getBreed() + " cat named " +
         * cat.getName());
         * 
         * // Estos son metodos abstracts from parent class
         * cat.makeSound();
         * cat.sleep();
         * 
         * Dog dog = new Dog("Timmy", "Zaguatito");
         * dog.makeSound();
         * dog.sleep();
         * dog.goodBoy();
         */

        Sedan corolla = new Sedan("Toyota", "Corolla", 0, 30000);
        Coupe camaro = new Coupe("Chevrolet", "Camaro", 1000, 50000);

        corolla.drive(1000);
        camaro.drive(5000);

        corolla.forSale(25000);
        camaro.forSale(45000);

    }
}
