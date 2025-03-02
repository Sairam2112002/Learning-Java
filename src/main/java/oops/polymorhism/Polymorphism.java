package oops.polymorhism;

import lombok.Getter;

public class Polymorphism {
    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.testPolymorphism();
    }

    private void testPolymorphism() {
        Shape shape = new Shape("blue");
        Shape circle1 = new Circle("green", 5.0);
        Circle circle2 = new Circle("orange", 10.0);

        /*
         * As we have performed method hiding for static method, the version of static method called will
         * depend on object reference of the object
         *
         * In this scenario, Shape is parent and Circle is child
         * Hence, shape instance can only be referred by Shape reference
         * Whereas circle instance can be referred by both Shape and Circle references
         *
         * Hence, the object that is referred by Shape reference will call the Shape's static method
         * But, the object that is referred by Circle reference will call the Circle's static method
         *
         * To eliminate confusion, method hiding is not recommended, and we can always call a static method using
         * class name instead of the object
         */
        shape.staticMethod();
        circle1.staticMethod();
        circle2.staticMethod();
        System.out.println();

        /* As we have performed method overriding for instance method, the version of instance method called will
         * depend on the object not the object reference
         *
         * Hence, the object of Shape type will call Shape's instance method and
         * the object of Circle type will call Circle's instance method irrespective of the references
         */
        shape.instanceMethod();
        circle1.instanceMethod();
        circle2.instanceMethod();

        /*
         * The overloaded methods' version will depend on the method version. Hence,
         * there will be no confusion here
         */
        shape.instanceMethod();
        shape.instanceMethod("String", 10);
        shape.instanceMethod(10, "String");
    }

    @Getter
    class Shape {
        private final String color;

        public Shape(String color) {
            this.color = color;
        }

        public void instanceMethod() {
            System.out.println("This is an instance method in base class Shape");
        }
        public static void staticMethod() {
            System.out.println("This is a static method in base class Shape");
        }

        /*
         * When in a class, a method is created with same name as other method in the same class,
         * then it is called method overloading or Runtime Polymorphism or Dynamic Polymorphism
         *
         * To allow method overloading either (the type of parameters) or (number of parameters) must be different
         * for overloading methods
         * Or if the type of parameters and number of parameters are same, the change in the order of parameters will
         * also allow method overloading
         *
         * Changing only return type will not allow method overloading
         */
        public void instanceMethod(String string, int integer) {
            System.out.println(string + integer);
        }

        public void instanceMethod(int integer, String string) {
            System.out.println(integer + string);
        }
    }

    @Getter
    class Circle extends Shape {
        private final double radius;

        /*
         * "super" keyword is used here to call the parent class constructor
         */
        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        /*
         * When a child class instance method has the same signature as the parent class instance method,
         * then it is called method overriding or Compile time Polymorphism or Static Polymorphism
         *
         *  The rule of visibility is that a child class overridden method cannot have a more restrictive access level
         * than its superclass method
         *
         * Based on the above rule, the allowed access levels for a child class overridden method for corresponding
         * superclass method are:
         *
         * parent class = public -> child class = public
         * parent class = protected -> child class = public, protected
         * parent class = default -> child class = public, protected, default
         *
         * private methods cannot be overridden since they are not visible outside the class
         *
         * Overridden methods, which are instance methods, use dynamic binding or late binding,
         * which occurs at runtime based on the object's runtime type
         *
         * The version of the overridden method that is executed is determined by the type of object instance,
         * not by the object reference that points to that object
         */
        @Override
        public void instanceMethod() {
            System.out.println("This is an instance method overridden in the child class Circle");
        }

        /*
         * When a child class static method has the same signature as the parent class static method,
         * it is called method hiding
         *
         * Static methods including those involved in method hiding are bound at compile time using static binding or
         * early binding
         *
         * In method hiding,
         * the superclass version of the method is hidden when accessed from the subclass, but it is not overridden
         *
         * This means that the version of the method to be executed is determined by the class type of the reference,
         * not by the actual class of the object
         */
        public static void staticMethod() {
            System.out.println("This is a static method in child class Circle with same signature as base class Shape");
        }
    }
}


