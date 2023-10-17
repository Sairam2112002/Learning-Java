package learning.oop;

import learning.oop.utilities.Animal;

class Shark extends Animal {
    public Shark(String type, String name, String ecosystem) {
        super(type, name, ecosystem);
    }

    // Compile-Time Polymorphism (Static)
    public void action(String ocean) {
        System.out.println("the Shark swims " + " in " + ocean + " ocean");
    }
    public void action(String ocean, int noOfSharks) {
        System.out.println(noOfSharks + " sharks" + " swims in " + ocean + " ocean");
    }

    // Runtime Polymorphism (Dynamic)
    @Override
    public void move() {
        System.out.println("The Shark swims");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Compile-Time Polymorphism (Static)
        System.out.println("Static Polymorphism: ");
        Shark shark = new Shark("Fish", "Shark", "Water");
        shark.action("Indian");
        shark.action("Indian", 5);
        System.out.println();

        // Runtime Polymorphism (Dynamic)
        System.out.println("Dynamic Polymorphism");
        Animal whale = new Animal("Fish", "Whale", "Water");
        shark.move();
        whale.move();
    }
}
