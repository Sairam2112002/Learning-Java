package oops.classes.finalclass;

/*
 * A final class in Java is a type of class that cannot be subclassed i.e. cannot be extended
 *
 * It is declared using "final" keyword
 */
public final class FinalClass {
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
     * Multiple constructors are allowed i.e. constructor overloading is possible
     */
    public FinalClass(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    /*
     * public, protected, default and private access modifiers are allowed for methods
     *
     * instance, static methods are allowed
     *
     * All methods are final by default
     *
     * In general, final method is also an instance method and static-final method is a static method. Hence,
     * corresponding rules apply for final and static-final methods
     */
    public void instanceMethod() {
        System.out.println("This is an instance method");
    }

    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass("instanceMethod");

        System.out.println(finalClass.instanceVariable);
        System.out.println(finalClass.FINAL_VARIABLE);
        finalClass.instanceMethod();

        System.out.println(FinalClass.staticVariable);
        System.out.println(FinalClass.STATIC_FINAL_VARIABLE);
        FinalClass.staticMethod();
    }
}
