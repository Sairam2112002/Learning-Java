package oops.classes.nonstaticinnerclass;

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
     * Non-static inner class can be either public or protected or default or private
     */
    class InnerClass {
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
         * Constructor can access both instance and static members of the outer class
         */
        public InnerClass(String innerInstanceVariable) {
            this.innerInstanceVariable = innerInstanceVariable;

            System.out.println(outerInstanceVariable);
            System.out.println(outerStaticVariable);
            System.out.println(OUTER_FINAL_VARIABLE);
            System.out.println(OUTER_STATIC_FINAL_VARIABLE);

            outerInstanceMethod();
            outerStaticMethod();
            outerFinalMethod();
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
         * instance methods can access both instance and static members of outer class
         */
        public void innerInstanceMethod() {
            System.out.println(outerInstanceVariable);
            System.out.println(outerStaticVariable);
            System.out.println(OUTER_FINAL_VARIABLE);
            System.out.println(OUTER_STATIC_FINAL_VARIABLE);

            outerInstanceMethod();
            outerStaticMethod();
            outerFinalMethod();
            outerStaticFinalMethod();
        }
        public final void innerFinalMethod() {
            System.out.println(outerInstanceVariable);
            System.out.println(outerStaticVariable);
            System.out.println(OUTER_FINAL_VARIABLE);
            System.out.println(OUTER_STATIC_FINAL_VARIABLE);

            outerInstanceMethod();
            outerStaticMethod();
            outerFinalMethod();
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
        OuterClass outer = new OuterClass("outerInstanceVariable");

        /*
         * Instantiated using an instance of the outer class followed by the "new" keyword
         * and the inner class constructor
         *
         * Outer class object reference is required because the non-static inner class is basically an instance member
         * of the outer class and to access instance members we need object reference in general
         */
        OuterClass.InnerClass innerClass2 = outer.new InnerClass("innerInstanceVariable");
    }
}
