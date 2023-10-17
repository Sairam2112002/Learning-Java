package learning.exceptionHandling;

import java.util.Arrays;

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new InvalidAgeException("This is an Invalid Age Exception");
        }
        catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
            System.out.println(Arrays.toString(exception.getStackTrace()));
            System.out.println("Invalid Age Exception handled");
        }
    }
}
