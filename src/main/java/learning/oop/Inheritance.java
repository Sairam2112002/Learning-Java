package learning.oop;

import learning.oop.utilities.Animal;

// Subclass
class Dog extends Animal {
    public Dog(String type, String name, String ecosystem) {
        super(type, name, ecosystem);
    }
}

// Subclass
class Cat extends Animal {
    public Cat(String type, String name, String ecosystem) {
        super(type, name, ecosystem);
    }
}

// Subclass extending another Subclass
class Husky extends Dog {
    public Husky(String type, String name, String ecosystem) {
        super(type, name, ecosystem);
    }
}

public class Inheritance {
    public static void main(String[] args) {}
}
