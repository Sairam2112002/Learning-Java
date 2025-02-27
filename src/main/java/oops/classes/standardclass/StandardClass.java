package oops.classes.standardclass;

public class StandardClass {
    /*
     * public, protected, default and private access modifiers are allowed for variables
     *
     * instance, static, final, static-final variables are allowed
     *
     * In general, final variable is also an instance variable and static-final variable is a static variable. Hence
     * corresponding rules apply for final and static-final variables
     */
    private String outerInstanceVariable;
    private static String outerStaticVariable;
    private final String OUTER_FINAL_VARIABLE = "OUTER_FINAL_VARIABLE";
    private static final String OUTER_STATIC_FINAL_VARIABLE = "OUTER_STATIC_FINAL_VARIABLE";

    /*
     * Multiple constructors are allowed i.e. constructor overloading is possible
     */
    public StandardClass(String outerInstanceVariable) {
        this.outerInstanceVariable = outerInstanceVariable;
    }

    /*
     * public, protected, default and private access modifiers are allowed for methods
     *
     * instance, static, final, static-final methods are allowed
     *
     * In general, final method is also an instance method and static-final method is a static method. Hence,
     * corresponding rules apply for final and static-final methods
     */
    public void outerInstanceMethod() {
        System.out.println("This is an instance method in Outer class");
    }
    public static void outerStaticMethod() {
        System.out.println("This is a static method in Outer class");
    }
    public final void outerFinalMethod() {
        System.out.println("This is a final method in Outer class");
    }
    public static void outerStaticFinalMethod() {
        System.out.println("This is a static-final method in Outer class");
    }

    public static void main(String[] args) {
        /*
         * Standard class objects are instantiated directly using "new" keyword
         */
        StandardClass standardClass = new StandardClass("outerInstanceVariable");

        /*
         * instance members can only be accesses with object reference
         */
        System.out.println(standardClass.outerInstanceVariable);
        System.out.println(standardClass.OUTER_FINAL_VARIABLE);
        standardClass.outerInstanceMethod();
        standardClass.outerFinalMethod();

        /*
         * static members can only be accesses with class name
         */
        System.out.println(StandardClass.outerStaticVariable);
        System.out.println(StandardClass.OUTER_STATIC_FINAL_VARIABLE);
        StandardClass.outerStaticMethod();
        StandardClass.outerStaticFinalMethod();
    }
}
