package learning.oop;

abstract class AnimalAbstractCLass {
    String type;
    String name;
    String ecosystem;

    // Abstract Method
    public abstract void move();

    // Non-Abstract and Non-Static Method
    public void printType() {
        System.out.println("Animal");
    }

    // Static Method
    public static void foodType() {
        System.out.println("Eats");
    }
}

// Non-Abstract class extending an Abstract class must implement the abstract methods of Abstract Class
class DogClass extends AnimalAbstractCLass {
    @Override
    public void move() {
        System.out.println("The Dog moves on land");
    }
}

// Abstract class extending another Abstract class need not implement the abstract methods of Abstract Class
// and can be implemented if necessary
abstract class CatAbstractClass extends AnimalAbstractCLass {

}

// "PersianCat" is a Non-Abstract class and extends an abstract class "CatAbstractClass" which extends "AnimalAbstractClass"
// Since "CatAbstractClass" is Abstract, it need not implement abstract methods in "AnimalAbstractClass"
// But "PersianCat" should implement abstract methods of "CatAbstractClass" and any abstract methods of its Abstract Superclasses
class PersianCat extends CatAbstractClass {
    @Override
    public void move() {
        System.out.println("The Persian Cat moves on land");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        DogClass dog1 = new DogClass();
        dog1.printType();
        dog1.move();
        System.out.println();

        AnimalAbstractCLass.foodType();
        System.out.println();

        PersianCat cat = new PersianCat();
        cat.printType();
        cat.move();
    }
}
