package Task3.task3;

import Task3.*;

public class main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Princess", 6),
                new Duck("Fuzzy", 2),
                new Bird("Pepe", 3),
                new Fish("Bubbles", 5)};

        for (Animal animal : animals) {
            animal.displayInfo();


        }


    }
}
