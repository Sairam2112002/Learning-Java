package oops.classes.enums;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/*
 * Enums (short for enumerations) are special classes
 * that represent a group of constants (unchangeable variables, like final variables)
 *
 * Enums were introduced in Java 5 to provide a type-safe way of representing fixed sets of constants
 *
 * Enums improve code readability and safety, making it easier to manage and use constant values
 *
 * @Setter annotation is not allowed for enum class
 */
@Getter
public enum Planets {
    /*
     * enum constants can override instance method, allowing each constant to behave differently
     */
    MERCURY(1, 57_910_000, 3.30e23) {
        @Override
        public void instanceMethod() {
            System.out.println("This is an overridden instance method in MERCURY enum constant");
        }
    },
    VENUS(2, 108_160_000, 4.87e24),
    EARTH(3, 149_600_000, 5.97e24),
    MARS(4, 227_940_000, 6.42e23),
    JUPITER(5, 778_330_000, 1.90e27),
    SATURN(6, 1_424_600_000, 5.68e26),
    URANUS(7, 2_873_550_000L, 8.68e25),
    NEPTUNE(8, 4_498_250_000L, 1.02e26);

    /*
     * public, protected, default and private access modifiers are allowed for variables
     *
     * instance, static, final, static-final variables are allowed
     *
     * In general, final variables are preferred to provide a fixed set of data (like properties tied to each constant)
     *
     * In general, final variable is also an instance variable and static-final variable is a static variable, Hence
     * corresponding rules apply for final and static-final variables
     */
    private final int orderInSolarSystem;
    private final long distanceFromSun;
    private final double mass;

    private String instanceVariable;
    private static String STATIC_VARIABLE = "STATIC_VARIABLE";
    private static final String STATIC_FINAL_VARIABLE = "STATIC_FINAL_VARIABLE";

    /*
     * Enum constructors are always either private or package-private (default),
     * we cannot use public or protected constructors
     *
     * Multiple constructors are allowed i.e. constructor overloading is possible
     */
    Planets(int orderInSolarSystem, long distanceFromSun, double mass) {
        this.orderInSolarSystem = orderInSolarSystem;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
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
        System.out.println("This is an instance method in an enum class");
    }
    public final void finalMethod() {
        System.out.println("This is a final method in an enum class");
    }
    public static void staticMethod() {
        System.out.println("This is a static method in an enum class");
    }
    public static final void staticFinalMethod() {
        System.out.println("This is a static-final method in an enum class");
    }

    @Override
    public String toString() {
        return "Planets{" +
                "orderInSolarSystem=" + orderInSolarSystem +
                ", distanceFromSun=" + distanceFromSun +
                ", mass=" + mass +
                '}';
    }

    public static void main(String[] args) {
        /*
         * Enums cannot be instantiated directly using the new keyword
         * because an enum specifies instances of its own type
         */
        Planets planet = Planets.EARTH;

        System.out.println(planet.instanceVariable);
        System.out.println(planet.distanceFromSun);
        System.out.println(Planets.STATIC_VARIABLE);
        System.out.println(Planets.STATIC_FINAL_VARIABLE);
        System.out.println();

        planet.instanceMethod();
        planet.finalMethod();
        Planets.staticMethod();
        Planets.staticFinalMethod();
        System.out.println();

        /*
         * Special methods in enum class:
         *
         * values(): All enums automatically contain a values() method,
         * which returns an array containing all the values of the enum
         *
         * valueOf(String name): enums also have a valueOf() method
         * to convert a string to its corresponding enum constant, if possible
         */

        Planets[] planets = Planets.values();
        Arrays.stream(planets).forEach(System.out::println);
        System.out.println();

        Planets earth = Planets.valueOf("EARTH");
        System.out.println(earth);
    }
}
