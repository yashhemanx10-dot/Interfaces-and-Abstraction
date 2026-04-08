package Task3;

public class Dog extends Animal{

    public Dog(String name, int age){
        super(name,"Dog", age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is barking!");
    }

}
