package Task3;

public abstract class Animal {
    protected  String name;
    protected String  species;
    protected int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;

    }

    public abstract void makeSound();
    public void displayInfo(){
        System.out.println(name + " is a " + age + " year old " + species);
    }

}

