# Animal Kingdom – Interfaces & Abstraction

A Java OOP project that models different types of animals using **abstract classes**, **interfaces**, and **multiple interface implementation**. Built as a practical exercise in combining abstraction with interface-driven behaviour.

---

## Project Structure

```
Task3/
├── Animal.java         # Abstract base class
├── Flyable.java        # Interface for flying animals
├── Swimmable.java      # Interface for swimming animals
├── Dog.java            # Extends Animal
├── Bird.java           # Extends Animal, implements Flyable
├── Fish.java           # Extends Animal, implements Swimmable
├── Duck.java           # Extends Animal, implements Flyable + Swimmable
└── task3/
    └── main.java       # Entry point
```

---

## How It Works

An abstract `Animal` class provides shared fields and behaviour for all animals. Two interfaces — `Flyable` and `Swimmable` — define optional capabilities that specific animals can implement. The `Duck` class demonstrates **multiple interface implementation** by implementing both.

### Class & Interface Overview

| Class / Interface | Type | Description |
|---|---|---|
| `Animal` | Abstract class | Base class with `name`, `species`, `age` and abstract `makeSound()` |
| `Flyable` | Interface | Defines `fly()` and a default `getMaxAltitude()` returning 1000 |
| `Swimmable` | Interface | Defines `swim()` |
| `Dog` | Subclass | Can only make a sound (barks) |
| `Bird` | Subclass + Flyable | Can make a sound and fly |
| `Fish` | Subclass + Swimmable | Can make a sound and swim |
| `Duck` | Subclass + Flyable + Swimmable | Can make a sound, fly, and swim |

---

## OOP Concepts Demonstrated

- **Abstraction** — `Animal` is abstract with `makeSound()` as an abstract method, enforcing each subclass to define its own sound
- **Interfaces** — `Flyable` and `Swimmable` define capabilities independently from the class hierarchy
- **Multiple interface implementation** — `Duck` implements both `Flyable` and `Swimmable`, showing how interfaces allow flexible composition that inheritance alone cannot achieve
- **Default interface methods** — `Flyable` includes a `getMaxAltitude()` default method, available to all flying animals without extra code
- **Polymorphism** — All animals are stored in an `Animal[]` array and iterated with a single loop

---

## How to Run

```
javac Task3/*.java Task3/task3/main.java
java Task3.task3.main
```

**Example output:**
```
Princess is a 6 year old Dog
Fuzzy is a 2 year old duck
Pepe is a 3 year old Bird
Bubbles is a 5 year old Fish
```

---

## Technologies Used

- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Concepts:** Abstract classes, interfaces, multiple interface implementation, default interface methods, polymorphism, packages

---

## Author

Developed as part of university programming assignments.
