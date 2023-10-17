package learning.exceptionHandling;

import java.util.*;

public class ExceptionPropagation {
    public static void main(String[] args) {
        ExceptionPropagation propagation = new ExceptionPropagation();
        propagation.method1();
    }

    void method1() {
        try {
            method2();
        }
        catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
            System.out.println(Arrays.toString(exception.getStackTrace()));
            System.out.println("Exception Handled in method1");
        }
    }

    void method2() {
        method3();
    }

    void method3() {
        method4();
    }
    void method4() {
        throw new RuntimeException("This is a Runtime Exception thrown from method4");
    }
}
