package oops.classes.abstractclass;

/*
 * Abstract classes cannot be instantiated on their own and must be inherited by other classes
 *
 * They are used for creating a base class that defines a template for other classes to build upon.
 */
public abstract class AbstractClass {
    /*
     * public, protected, default and private access modifiers are allowed for variables
     *
     * instance, static, final, static-final variables are allowed
     *
     * In general, final variable is also an instance variable and static-final variable is a static variable. Hence,
     * corresponding rules apply for final and static-final variables
     */
    private String instanceVariable;
    private static String staticVariable;
    private final String FINAL_VARIABLE = "FINAL_VARIABLE";
    private static final String STATIC_FINAL_VARIABLE = "STATIC_FINAL_VARIABLE";

    /*
     * Abstract classes can have constructors,
     * and these constructors should be called from their subclasses using the "super" keyword
     *
     * Multiple constructors are allowed i.e. constructor overloading is possible and any one of the constructor
     * must be called from the child class constructor
     */
    public AbstractClass(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    /*
     * public, protected, default and private access modifiers are allowed for methods
     *
     * instance, static, final, static-final and abstract methods are allowed
     *
     * In general, final method is also an instance method and static-final method is a static method. Hence,
     * corresponding rules apply for final and static-final methods
     */
    public void instanceMethod() {
        System.out.println("This is an instance method");
    }

    public final void finalMethod() {
        System.out.println("This is a final method");
    }

    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    public static final void staticFinalMethod() {
        System.out.println("This is a static-final method");
    }

    public abstract void abstractMethod();
}

class ChildClass extends AbstractClass {
    public ChildClass(String instanceVariable) {
        super(instanceVariable);
    }

    @Override
    public void abstractMethod() {
        System.out.println("This is an abstract method implemented in the child class");
    }

    public static void main(String[] args) {
        /*
         * Abstract class is instantiated through the child class
         */
        AbstractClass childClass = new ChildClass("instanceVariable");

        childClass.abstractMethod();
    }
}
