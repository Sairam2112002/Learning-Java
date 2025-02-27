package oops.classes.staticinnerclass;

public class OuterClass {
    private String outerInstanceVariable;
    private static String outerStaticVariable;
    private final String OUTER_FINAL_VARIABLE = "OUTER_FINAL_VARIABLE";
    private static final String OUTER_STATIC_FINAL_VARIABLE  = "OUTER_STATIC_FINAL_VARIABLE";

    public OuterClass(String outerInstanceVariable) {
        this.outerInstanceVariable = outerInstanceVariable;
    }

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

    /*
     * static inner class can be either public or protected or default or private
     */
    static class InnerClass {
        /*
         * public, protected, default and private access modifiers are allowed for variables
         *
         * instance, static, final, static-final variables are allowed
         *
         * In general, final variable is also an instance variable and static-final variable is a static variable, Hence
         * corresponding rules apply for final and static-final variables
         */
        private String innerInstanceVariable;
        private static String innerStaticVariable;
        private final String INNER_FINAL_VARIABLE = "INNER_FINAL_VARIABLE";
        private static final String INNER_STATIC_FINAL_VARIABLE = "INNER_STATIC_FINAL_VARIABLE";

        /*
         * Multiple constructors are allowed i.e. constructor overloading is possible
         *
         * Constructor can only access static members of the outer class
         */
        public InnerClass(String innerInstanceVariable) {
            this.innerInstanceVariable = innerInstanceVariable;

            System.out.println(outerStaticVariable);
            System.out.println(OUTER_STATIC_FINAL_VARIABLE);

            outerStaticMethod();
            outerStaticFinalMethod();
        }

        /*
         * public, protected, default and private access modifiers are allowed for methods
         *
         * instance, static, final, static-final methods are allowed
         *
         * In general, final method is also an instance method and static-final method is a static method. Hence,
         * corresponding rules apply for final and static-final methods
         */

        /*
         * instance methods can only access static members of the outer class
         */
        public void innerInstanceMethod() {
            System.out.println(outerStaticVariable);
            System.out.println(OUTER_STATIC_FINAL_VARIABLE);

            outerStaticMethod();
            outerStaticFinalMethod();
        }
        public final void innerFinalMethod() {
            System.out.println(outerStaticVariable);
            System.out.println(OUTER_STATIC_FINAL_VARIABLE);

            outerStaticMethod();
            outerStaticFinalMethod();
        }

        /*
         * static methods can only access static members of the outer class
         */
        public static void innerStaticMethod() {
            System.out.println(outerStaticVariable);
            System.out.println(OUTER_STATIC_FINAL_VARIABLE);

            outerStaticMethod();
            outerStaticFinalMethod();
        }
        public static final void innerStaticFinalMethod() {
            System.out.println(outerStaticVariable);
            System.out.println(OUTER_STATIC_FINAL_VARIABLE);

            outerStaticMethod();
            outerStaticFinalMethod();
        }
    }

    public static void main(String[] args) {
        /*
         * Instantiated directly using "new" keyword and then outer class name
         */
        OuterClass.InnerClass innerClass1 = new OuterClass.InnerClass("innerInstanceVariable");

        /*
         * This type of instantiation where we do not specify outer class name only works if the instantiation
         * is happening inside outer class or if we statically import the inner class
         */
        OuterClass.InnerClass innerClass2 = new InnerClass("innerInstanceVariable");
    }
}
