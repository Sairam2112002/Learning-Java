package java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    /*
     * A functional interface is an interface that contains exactly one abstract method,
     * although it can have multiple default or static methods.
     *
     * This design allows the functional interfaces to be used for lambda expressions,
     * enhancing the capability to express instances of single-method classes more concisely.
     */

    public static void usingFunctionalInterfacesWithLambdaExpressions() {
        Predicate<Integer> predicate = i -> i < 10;
        System.out.println(predicate.test(5));

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("This is a Consumer Functional Interface");

        Supplier<String> supplier = () -> "This is a Supplier Functional Interface";
        System.out.println(supplier.get());

        Function<String, Integer> function = s -> s.length();
        System.out.println(function.apply("Function"));
    }

    public static void usingFunctionalInterfacesWithMethodReferences() {
        Consumer<String> consumer = System.out::println;
        consumer.accept("This is a Consumer Functional Interface");

        Function<String, Integer> function = String::length;
        System.out.println(function.apply("Function"));
    }

    public static void usingFunctionalInterfacesWithAnonymousClasses() {
        Predicate<Integer> predicate = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 10;
            }
        };
        System.out.println(predicate.test(10));

        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("This is a Consumer Functional Interface");

        Supplier<String> supplier = new Supplier<>() {
            @Override
            public String get() {
                return "This is a Supplier Functional Interface";
            }
        };
        System.out.println(supplier.get());

        Function<String, Integer> function = new Function<>() {
            @Override
            public Integer apply(String string) {
                return string.length();
            }
        };
        System.out.println(function.apply("Function"));
    }

    /*
     * Along with the above Functional Interfaces provided by java.util.function,
     * we can also create a custom functional interface
     *
     * To make an interface a Functional Interface, we have to annotate the interface with @java.lang.FunctionalInterface
     * annotation
     *
     * We can instantiate the abstract method
     */
    @FunctionalInterface
    public interface CustomFunctionalInterface1 {
        void abstractMethod();
    }

    @FunctionalInterface
    public interface CustomFunctionalInterface2 {
        int getStringLength(String string);
    }

    public static void testingCustomFunctionalInterfaceWithAnonymousClass() {
        CustomFunctionalInterface1 functionalInterface = new CustomFunctionalInterface1() {
            @Override
            public void abstractMethod() {
                System.out.println("This is a sample abstract method in a custom Functional Interface");
            }
        };
        functionalInterface.abstractMethod();
    }

    public static void testingCustomFunctionalInterfaceWithLambdaExpression() {
        CustomFunctionalInterface1 functionalInterface =
                () -> System.out.println("This is a sample abstract method in a custom Functional Interface");
        functionalInterface.abstractMethod();
    }

    public static void testingCustomFunctionalInterfaceWithMethodReference() {
        CustomFunctionalInterface2 functionalInterface = String::length;
        System.out.println(functionalInterface.getStringLength("Functional Interface"));
    }

    /*
     * We can also use Anonymous class for implementation
     */
    public static CustomFunctionalInterface1 passingFunctionalInterfaceImplementationAsAnArgument() {
        return () -> System.out.println("This is a sample abstract method in a custom Functional Interface");
    }

    public static void receivingFunctionalInterfaceImplementationAsAParameter(CustomFunctionalInterface1 functionalInterface) {
        functionalInterface.abstractMethod();
    }

    public static void main(String[] args) {
        System.out.println("Using Functional Interfaces with Lambda Expressions:");
        usingFunctionalInterfacesWithLambdaExpressions();
        System.out.println();
        System.out.println("Using Functional Interfaces with Method References:");
        usingFunctionalInterfacesWithMethodReferences();
        System.out.println();
        System.out.println("Using Functional Interfaces with Anonymous classes");
        usingFunctionalInterfacesWithAnonymousClasses();
        System.out.println();

        System.out.println("Using custom Functional Interface with Anonymous class");
        testingCustomFunctionalInterfaceWithAnonymousClass();
        System.out.println();
        System.out.println("Using custom Functional Interface with Lambda expression");
        testingCustomFunctionalInterfaceWithLambdaExpression();
        System.out.println();
        System.out.println("Using custom Functional Interface with Method Reference");
        testingCustomFunctionalInterfaceWithMethodReference();
        System.out.println();
        System.out.println("Passing and using Functional Interface implementation as an argument");
        receivingFunctionalInterfaceImplementationAsAParameter(passingFunctionalInterfaceImplementationAsAnArgument());
    }
}
