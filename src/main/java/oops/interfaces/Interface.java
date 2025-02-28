package oops.interfaces;

/*
 * An interface in Java is a reference type, similar to a class
 *
 * Interfaces cannot be instantiated directly. They need to be implemented by classes or extended by other interfaces
 *
 * Interface can contain only constants, method signatures, default methods, static methods, and nested types
 *
 * Interfaces cannot contain instance fields
 *
 * Interfaces can contain main method
 */
public interface Interface {
    /*
     * Only public access modifier is allowed
     *
     * Only static-final variable are allowed
     *
     * All variables are public, static and final by default
     */
    String STATIC_FINAL_VARIABLE = "STATIC_FINAL_VARIABLE";

    /*
     * Interfaces cannot have constructors as they cannot be instantiated directly
     */

    /*
     * abstract, static and default methods are allowed
     *
     * Implementation can be provided for static and default methods
     */

    /*
     * Only public access modifier is allowed for abstract methods
     *
     * abstract methods are public and abstract by default
     */
    void abstractMethod();

    /*
     * Only public access modifier is allowed for default methods
     *
     * default methods are public by default
     *
     * default method is also an instance method
     *
     * default methods are introduce for interfaces in Java 8
     */
    default void defaultMethod() {
        System.out.println("This is a default method in an interface");
        privateMethod();
    }

    /*
     * Only public and private access modifiers are allowed for static methods
     *
     * static methods are public by default
     */
    static void staticMethod() {
        System.out.println("This is a static method in an interface");
    }

    /*
     * private methods are introduced for interfaces in Java 9
     *
     * private method is also an instance method
     */
    private void privateMethod() {
        System.out.println("This is a private method in an interface");
    }

    /*
     * main method is allowed in an interface
     *
     * For main method, there is no need to specify public modifier explicitly as static method in interfaces are
     * public by default
     */
    static void main(String[] args) {
        System.out.println("This is an interface");
    }
}

class ChildClass implements Interface {
    @Override
    public void abstractMethod() {
        System.out.println("This is the abstract method implemented in a child class");
    }

    public static void main(String[] args) {
        Interface learningInterface = new ChildClass();

        System.out.println(Interface.STATIC_FINAL_VARIABLE);

        learningInterface.abstractMethod();
        learningInterface.defaultMethod();
        Interface.staticMethod();
    }
}
