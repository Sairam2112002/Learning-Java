package oops.classes.anonymousclass;

/*
 * Anonymous class is a type of inner class and do not have a name
 *
 * They are typically used for instantiating classes that only need to be used once or
 * for implementing "interfaces" or "abstract classes" on the spot
 *
 * Since they have no name, we can’t use them in order to create instances of anonymous classes
 *
 * As a result, we have to declare and instantiate anonymous classes in a single expression at the point of use
 *
 * We may either extend an existing class or implement an interface
 *
 * Anonymous classes are final classes by default hence, corresponding properties apply
 */
public class AnonymousClasses {
    public static void main(String[] args) {
        NormalClass anonymousClassOfNormalClass = new NormalClass("instanceVariable") {
            /*
             * public, protected, default and private access modifiers are allowed for variables
             *
             * instance, static, final, static-final variables are allowed
             *
             * In general, final variable is also an instance variable and static-final variable is a static variable. Hence,
             * corresponding rules apply for final and static-final variables
             *
             * However, these fields are limited to use inside the anonymous class
             */
            private String anonymousClassInstanceVariable;
            private static String anonymousClassStaticVariable;
            private final String ANONYMOUS_CLASS_FINAL_VARIABLE = "ANONYMOUS_CLASS_FINAL_VARIABLE";
            private static final String ANONYMOUS_CLASS_STATIC_FINAL_VARIABLE = "ANONYMOUS_CLASS_STATIC_FINAL_VARIABLE";

            /*
             * public, protected, default and private access modifiers are allowed for methods
             *
             * instance, static methods are allowed
             *
             * All methods are final by default since it is a final class by default
             *
             * In general, final method is also an instance method and static-final method is a static method. Hence,
             * corresponding rules apply for final and static-final methods
             *
             * However, these methods are limited to use inside the anonymous class since these are not overwritten from the parent class
             */
            public void anonymousClassInstanceMethod() {
                System.out.println("This is an instance method in an  anonymous class");
            }
            public static void anonymousClassStaticMethod() {
                System.out.println("This is a static method in an anonymous class");
            }

            /*
             * When an anonymous class extends a normal class,
             * you can override its methods or use the inherited methods as needed
             */
            @Override
            public void instanceMethod() {
                System.out.println("This is an instance method overridden in the anonymous class");
            }
        };

        /*
         * Only overridden methods and the instance methods of parent class can be accessed using the anonymous class object
         */
        anonymousClassOfNormalClass.instanceMethod();
        anonymousClassOfNormalClass.finalMethod();

        AbstractClass anonymousClassOfAbstractClass = new AbstractClass("instanceVariable") {
            /*
             * Apart from the below property, anonymous class created for an abstract class follows the same
             * properties as the anonymous class created for a normal class
             */

            /*
             * When anonymous class is created for an abstract class, the abstract methods of the parent abstract
             * class must be implemented
             */
            @Override
            public void abstractMethod() {
                System.out.println("This is an abstract method overridden in the anonymous class");
            }
        };

        /*
         * Only overridden methods (both abstract and instance parent method) and the
         * instance methods of parent class can be accessed using the anonymous class object
         */
        anonymousClassOfAbstractClass.abstractMethod();
        anonymousClassOfAbstractClass.instanceMethod();
        anonymousClassOfAbstractClass.finalMethod();

        Interface anonymousClassOfInterface = new Interface() {
            /*
             * Apart from the below property, anonymous class created for an interface follows the same
             * properties as the anonymous class created for a normal class
             */

            /*
             * When anonymous class is created for an interface, the abstract methods of the parent abstract
             * class must be implemented
             */
            @Override
            public void abstractMethod() {
                System.out.println("This is an abstract method overridden in the anonymous class");
            }
        };

        /*
         * Overridden abstract methods and default methods of the interface can be accessed using the
         * anonymous class object
         */
        anonymousClassOfInterface.abstractMethod();
        anonymousClassOfInterface.defaultMethod();

        /*
         * static methods and variable of the interface can be accessed using the Interface name
         */
        Interface.staticMethod();
        System.out.println(Interface.STATIC_FINAL_VARIABLE);
    }
}

class NormalClass {
    private String instanceVariable;
    private static String staticVariable;
    private final String FINAL_VARIABLE = "FINAL_VARIABLE";
    private static final String STATIC_FINAL_VARIABLE = "STATIC_FINAL_VARIABLE";

    public NormalClass(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

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
}

abstract class AbstractClass {
    private String instanceVariable;
    private static String staticVariable;
    private final String FINAL_VARIABLE = "FINAL_VARIABLE";
    private static final String STATIC_FINAL_VARIABLE = "STATIC_FINAL_VARIABLE";

    public AbstractClass(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

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

interface Interface {
    String STATIC_FINAL_VARIABLE = "STATIC_FINAL_VARIABLE";

    void abstractMethod();
    default void defaultMethod() {
        System.out.println("This is a default method in an interface");
        privateMethod();
    }
    static void staticMethod() {
        System.out.println("This is a static method in an interface");
    }
    private void privateMethod() {
        System.out.println("This is a private method in an interface");
    }
}
