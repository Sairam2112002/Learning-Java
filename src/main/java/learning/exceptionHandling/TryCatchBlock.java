package learning.exceptionHandling;

import java.util.Arrays;

public class TryCatchBlock {
    public static void main(String[] args) {
        // Try Block with Catch and Finally Blocks
        try {
            System.out.println(5/0);
        }
        catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            System.out.println(Arrays.toString(exception.getStackTrace()));
        }
        finally {
            System.out.println("#1 This is a Finally Block");
        }

        System.out.println("------------------------------------");

        // Try Block with only Catch Block
        try {
            throw new ArithmeticException("This is an Arithmetic Exception");
        }
        catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            System.out.println(Arrays.toString(exception.getStackTrace()));
        }

        System.out.println("------------------------------------");

        // Try Block with multiple Catch Blocks and a Finally Block
        try {
            System.out.println(5/0);
        }
        catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            System.out.println(Arrays.toString(exception.getStackTrace()));
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println(Arrays.toString(exception.getStackTrace()));
        }
        finally {
            System.out.println("#3 This is a Finally Block");
        }

        System.out.println("------------------------------------");

        // try block with only finally Block
        try {
            throw new ArrayIndexOutOfBoundsException("Array Index Out Of Bounds Exception");
        }
        finally {
            System.out.println("#4 This is a Finally Block");
        }


    }
}
