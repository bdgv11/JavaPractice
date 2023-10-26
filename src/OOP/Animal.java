package OOP;

abstract class Animal {

    protected String name;
    private String breed;

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    abstract void makeSound();

    public void sleep() {
        System.out.println("Sleeping ... zzzzz");
    }

}
