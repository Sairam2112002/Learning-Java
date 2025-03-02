package oops.classes.standardclass;

public class StandardClass {
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
    public StandardClass(String outerInstanceVariable) {
        this.instanceVariable = outerInstanceVariable;
    }

    /*
     * public, protected, default and private access modifiers are allowed for methods
     *
     * instance, static, final, static-final methods are allowed
     *
     * In general, final method is also an instance method and static-final method is a static method. Hence,
     * corresponding rules apply for final and static-final methods
     */
    public void instanceMethod() {
        System.out.println("This is an instance method in Normal class");
    }
    public static void staticMethod() {
        System.out.println("This is a static method in Normal class");
    }
    public final void finalMethod() {
        System.out.println("This is a final method in Normal class");
    }
    public static void staticFinalMethod() {
        System.out.println("This is a static-final method in Normal class");
    }

    public static void main(String[] args) {
        /*
         * Standard class objects are instantiated directly using "new" keyword
         */
        StandardClass standardClass = new StandardClass("outerInstanceVariable");

        /*
         * instance members can only be accesses with object reference
         */
        System.out.println(standardClass.instanceVariable);
        System.out.println(standardClass.FINAL_VARIABLE);
        standardClass.instanceMethod();
        standardClass.finalMethod();

        /*
         * static members can only be accesses with class name
         */
        System.out.println(StandardClass.staticVariable);
        System.out.println(StandardClass.STATIC_FINAL_VARIABLE);
        StandardClass.staticMethod();
        StandardClass.staticFinalMethod();
    }
}
