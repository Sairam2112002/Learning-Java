package designprinciples;

public class DRYPrinciple {

    // Before applying DRY Principle
    static class Calculator1 {
        public static void main(String[] args) {
            int a = 20, b = 10;

            int sum = a + b;
            System.out.println("Sum: " + sum);

            int difference = a - b;
            System.out.println("Difference: " + difference);

            int product = a * b;
            System.out.println("Product: " + product);

            int quotient = a / b;
            System.out.println("Quotient: " + quotient);
        }
    }

    // After applying DRY Principle
    static class Calculator2 {
        public static void printOperation(String operation, int result) {
            System.out.println(operation + ": " + result);
        }

        public static int add(int a, int b) {
            return a + b;
        }
        public static int subtract(int a, int b) {
            return a - b;
        }
        public static int multiply(int a, int b) {
            return a * b;
        }
        public static int divide(int a, int b) {
            return a / b;
        }

        public static void main(String[] args) {
            int a = 20, b = 10;

            printOperation("Sum", add(a, b));
            printOperation("Difference", subtract(a, b));
            printOperation("Product", multiply(a, b));
            printOperation("Quotient", divide(a, b));
        }
    }
}
