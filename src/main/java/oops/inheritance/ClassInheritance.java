package oops.inheritance;

import lombok.Getter;

public class ClassInheritance {
    @Getter
    class Shape {
        private final String color;

        public Shape(String color) {
            this.color = color;
        }

        public double area() {
            return 0;
        }

        public double perimeter() {
            return 0;
        }

        public void instanceMethod() {
            System.out.println("This is an instance method in base class Shape");
        }
        public static void staticMethod() {
            System.out.println("This is a static method in base class Shape");
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

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }
}
