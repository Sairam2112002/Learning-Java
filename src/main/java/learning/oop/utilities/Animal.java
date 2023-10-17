package learning.oop.utilities;

public class Animal {
    String type;
    String name;
    String ecosystem;

    public Animal(String type, String name, String ecosystem) {
        this.type = type;
        this.name = name;
        this.ecosystem = ecosystem;
    }

    public void move() {
        System.out.println("The animal moves");
    }
}
