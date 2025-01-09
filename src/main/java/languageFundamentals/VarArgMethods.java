package languageFundamentals;

public class VarArgMethods {
    public static void main(String[] args) {
        // 1. Calling a var-arg method

        // 1.1. With multiple parameters

        varArgMethod1("Dog", "Cat", "Bird", "Fish");

        // 1.2. With an array

        varArgMethod1(new String[]{"Dog", "Cat", "Bird", "Fish"});

        // 2. Array var-arg

        varArgMethod2(new String[]{"Dog", "Cat", "Bird", "Fish"}, new String[]{"Dog", "Cat", "Bird", "Fish"});

        // 3. Object var-arg

        varArgMethod3("Dog", "Cat", "Bird", "Fish");
        varArgMethod3(new Object[]{"Dog", "Cat", "Bird", "Fish"});

        // 4. var-arg accompanied by normal arguments

        varArgMethod4(100, '@', "Dog", "Cat", "Bird", "Fish");
        varArgMethod4(100, '@', new String[]{"Dog", "Cat", "Bird", "Fish"});
    }

    // Variable-Arguments method

    public static void varArgMethod1(String... stringArray) {
        for(String string: stringArray) {
            System.out.print(string + ", ");
        }
        System.out.println("\n");
    }

    // A Variable-Argument can be also an Array (also a multidimensional array) or an Object
    public static void varArgMethod2(String[]... StringArray) {
        for(String[] oneDimensionalArray: StringArray) {
            for(String string: oneDimensionalArray) {
                System.out.print(string + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void varArgMethod3(Object... objectArray) {
        for(Object string: objectArray) {
            System.out.print(string.toString() + ", ");
        }
        System.out.println("\n");
    }

    // A var-arg can be accompanied by normal arguments as well, but var-arg must be the last parameter

    public static void varArgMethod4(int number, char character, String... stringArray) {
        System.out.print(number + ", " + character + ", ");
        for(String string: stringArray) {
            System.out.print(string + ", ");
        }
        System.out.println("\n");
    }
}
