package languageFundamentals;

public class Variables {
    int instanceVariable = 10;
    static int staticVariable = 100;

    public void m1() {
        // Instance variables can be accessed directly from instance area
        System.out.println(instanceVariable);

        // Static variables can be accessed directly from instance area
        System.out.println(staticVariable);

        int localVariable = 1000;
    }

    public static void main(String[] args) {
        // 1. Division - 1

        // 1.1. Primitive Variables
        int i = 100;
        short s = 20;
        long l = 25000L;

        // 1.2. Reference Variables
        String string = "Harry Potter";
        Object object = 100;

        // 2. Division - 2

        // 2.1. Instance Variables

        /*
         * Instance variables cannot be accessed directly from static area (we are inside static main method)
         * But they can be accessed with the object reference of the class
         */

        Variables variables = new Variables();
        System.out.println(variables.instanceVariable);

        // 2.2. Static Variables

        /*
         * Static variables can be accessed directly from static area, accessing via an object reference is not required
         */

        System.out.println(staticVariable);
        System.out.println(variables.staticVariable);

        // 2.3. Local Variables

        /*
         * Local variables are only accessible in the block (method/loop/conditional blocks/etc.)they are declared
         * Access modifiers are not allowed for local variables
         */

        for(int x = 1; x <= 10; x++) { // x is a local variable
            System.out.print(x + ", ");
        }
    }
}
