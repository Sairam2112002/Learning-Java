package languageFundamentals;

public class Literals {
    public static void main(String[] args) {
        // 1. Integer Literals

        int i1 = 10; // decimal form
        int i2 = 010; // octal form
        int i3 = 0x10; // hexadecimal form
        System.out.println("Integer Literals: " + i1 + ", " + i2 + ", " + i3);

        // 2. Long Literal

        long l1 = 100L; // in decimal form
        long l2 = 0200L; // in octal form
        long l3 = 0x100L; // in hexadecimal form
        System.out.println("Long Literals: " + l1 + ", " + l2 + ", " + l3);

        // 3. Floating Point Literals

        double d1 = 123.456;
        double d2 = 123.456D;
        float f1 = 0123.456F; // even though started with 0, it is considered as decimal form, it is not considered as octal form
        System.out.println("Floating Point Literals: " + d1 + ", " + d2 + ", " + f1);

        // Edge cases:
        // All integer literals (decimal/octal/hexadecimal) can be directly assigned to floating-point literals
        // Exponential notation is also allowed for floating-point literals

        double d3 = 10; // integer literal in decimal form
        double d4 = 0777; // integer literal in octal form
        double d5 = 0xface; // integer literal in hexadecimal form
        double d6 = 1.2e3; // exponential form
        System.out.println("Floating Point Literals edge cases: " + d3 + ", " + d4 + ", " + d5 + ", " + d6);

        // Precision of Floating Point Literals:

        float f2 = (float) 22 /7; // precision up to 6 decimal places
        double d7 = (double) 22/7; // precision up to 15 decimal places
        System.out.print("Precision of Floating point Literals: Value of pi: ");
        System.out.println("float = " + f2 + "; " + "double = " + d7);

        // 4. Boolean Literal
        // Only allowed values = true, false

        boolean b1 = true;
        boolean b2 = false;
        System.out.println("Boolean Literals: " + b1 + ", " + b2);

        // 5. Character Literals

        char c1 = 'a'; // Only a single character inside single quotes is allowed

        // Edge cases:
        // We can specify char literal in integer form as well (decimal/octal/hexadecimal)
        // We can specify char literal in Unicode form as well
        // Every escape character is also a valid char literal

        char c2 = 98; // integer literal in decimal form
        char c3 = 0777; // integer literal in octal form
        char c4 = 0xface; // integer literal in hexadecimal form
        char c5 = '\u1234'; // Unicode form
        char c6 = '\n'; // escape character
        System.out.println("Character Literals: " + c1 + ", " + c2 + ", " + c3 + ", " + c4 + ", " + c5 + ", " + c6);

        // 6. String Literal
        // Any sequence of characters within double quotes is treated as String literal

        String s = "This is a Java program";
        System.out.println("String Literal: " + s);

        // 7. Java 1.7 enhancements in Literals
        // We can specify the integer literal in binary form as well.
        // We can use _ between digits of numeric literal (integer/floating point)m multiple _ 's are also allowed
        System.out.println("\n" + "Java 1.7 enhancements in Literals: ");

        int i4 = 0B01111;
        System.out.println("Integer Literal in Binary form: " + i4);

        int i5 = 1_23_456;
        float f3 = 1_23_456.7_8_9F;
        double d8 = 1_23____456.7_8____9;
        System.out.println("Using _ between digits: " + i5 + ", " + f3 + ", " + d8);
    }
}
