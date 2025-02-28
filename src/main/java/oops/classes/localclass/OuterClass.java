package oops.classes.localclass;

/*
 * Local classes are defined within a block of code, typically within a method
 *
 * They are not a member of any enclosing class, so they are scoped to the block where they are declared
 */
public class OuterClass {
    /*
     * Local class is a type of inner class i.e. it can only be a non-static class
     *
     * Local class can be defined inside a non-static method
     */
    public void localClassEnclosingNonStaticMethod() {
        String methodVariable = "localVariable";
        final String METHOD_FINAL_VARIABLE = "LOCAL_FINAL_VARIABLE";

        /*
         * A local class cannot be static because it is a type of inner class and can access instance variables
         * of enclosing block
         *
         * A local class can be only default, it cannot be public or protected or private
         *
         * The scope of the class is limited to its enclosing block
         */
        class LocalClass {

            /*
             * public, protected, default and private access modifiers are allowed for variables although
             * the scope of variables is limited to the enclosing block
             *
             * instance, static, final, static-final variables are allowed
             *
             * In general, final variable is also an instance variable and static-final variable is a static variable, Hence
             * corresponding rules apply for final and static-final variables
             */
            private String localInstanceVariable;
            private static String localStaticVariable;
            private final String LOCAL_FINAL_VARIABLE = "LOCAL_FINAL_VARIABLE";
            private static final String LOCAL_STATIC_FINAL_VARIABLE = "LOCAL_STATIC_FINAL_VARIABLE";

            /*
             * Multiple constructors are allowed i.e. constructor overloading is possible
             *
             * Constructor can access only instance variable of the enclosing block
             */
            public LocalClass(String localInstanceVariable) {
                this.localInstanceVariable = localInstanceVariable;

                System.out.println(methodVariable);
                System.out.println(METHOD_FINAL_VARIABLE);
            }

            /*
             * public, protected, default and private access modifiers are allowed for methods although
             * the scope of methods is limited to the enclosing block
             *
             * instance, static, final, static-final methods are allowed
             *
             * In general, final method is also an instance method and static-final method is a static method. Hence,
             * corresponding rules apply for final and static-final methods
             */

            /*
             * instance methods can access instance variable of the enclosing block
             */
            private void localInstanceMethod() {
                System.out.println(methodVariable);
                System.out.println(METHOD_FINAL_VARIABLE);
            }
            private final void localFinalMethod() {
                System.out.println(methodVariable);
                System.out.println(METHOD_FINAL_VARIABLE);
            }

            /*
             * static methods can cannot access anything from its enclosing block
             */
            private static void localStaticMethod() {

            }
            private static final void localStaticFinalMethod() {

            }
        }

        /*
         * Local class can only be instantiated inside the enclosing block and directly using
         * "new" keyword
         */
        LocalClass localClass = new LocalClass("localInstanceVariable");

        /*
         * Even though we are now outside the class but still inside the enclosing block enclosing the local class,
         * we can still access the private members of the local class
         */
        System.out.println(localClass.localInstanceVariable);
        System.out.println(localClass.LOCAL_FINAL_VARIABLE);
        localClass.localInstanceMethod();
        localClass.localFinalMethod();

        System.out.println(LocalClass.localStaticVariable);
        System.out.println(LocalClass.LOCAL_STATIC_FINAL_VARIABLE);
        LocalClass.localStaticMethod();
        LocalClass.localStaticFinalMethod();
    }

    /*
     * Local class can also be defined inside a static method
     *
     * The properties are same as the local class when defined inside a non-static method as shown above
     */
    public static void localClassEnclosingStaticMethod() {
        String methodVariable = "localVariable";
        final String METHOD_FINAL_VARIABLE = "LOCAL_FINAL_VARIABLE";

        class LocalClass {
            private String localInstanceVariable;
            private static String localStaticVariable;
            private final String LOCAL_FINAL_VARIABLE = "LOCAL_FINAL_VARIABLE";
            private static final String LOCAL_STATIC_FINAL_VARIABLE = "LOCAL_STATIC_FINAL_VARIABLE";

            public LocalClass(String localInstanceVariable) {
                this.localInstanceVariable = localInstanceVariable;
            }

            private void localInstanceMethod() {
                System.out.println(methodVariable);
                System.out.println(METHOD_FINAL_VARIABLE);
            }
            public final void localFinalMethod() {
                System.out.println(methodVariable);
                System.out.println(METHOD_FINAL_VARIABLE);
            }

            public static void localStaticMethod() {

            }
            public static final void localStaticFinalMethod() {

            }
        }

        LocalClass localClass = new LocalClass("localInstanceVariable");
    }
}
