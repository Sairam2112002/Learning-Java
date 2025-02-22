package designprinciples;

public class KISSPrinciple {

    // Creating a simple Rectangle class
    static class Rectangle {
        private double length;
        private double breadth;

        public Rectangle(double length, double width) {
            this.length = length;
            this.breadth = width;
        }

        public double calculatePerimeter() {
            return 2 * (length + breadth);
        }

        public double calculateArea() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
