package oops.classes.records;

/*
 * records are a special kind of class in Java aimed at simplifying the modeling of immutable data aggregates
 *
 * Commonly, we write classes to simply hold data, such as database results, query results, or information from a service
 * In many cases, this data is immutable
 * To accomplish this, we create data class with the following:
 *      1. private, final field for each piece of data
 *      2. getter for each field
 *      3. public constructor with a corresponding argument for each field
 *      4. equals method that returns true for objects of the same class when all fields match
 *      5. hashCode method that returns the same value when all fields match
 *      6. toString method that includes the name of the class and the name of each field and its corresponding value
 * While IDEs can generate all the above elements, they fail to automatically update our classes when we add a new field
 *
 * record are introduced in Java 14 as a preview feature and later finalized in Java 16
 *
 * The equals, hashCode, and toString methods, as well as the private, final fields and public constructor,
 * are generated by the Java compiler
 */

/*
 * To create a record, we have to declare the attributes of the record as parameters of the record
 */
public record PersonRecord(String name, int age) {
    /*
     * All added attributes will be private and final implicitly
     *
     * A public constructor with corresponding parameters to attributes is generated
     *
     * public getter methods whose names match the attribute names are generated,
     * e.g. name() method for name attributes but not getName()
     *
     * toString, hashCode and equals methods are generated
     *
     * Overloaded constructors can be created
     */

    /*
     * Constructors:
     *
     * 1: Canonical Constructor
     * It is provided by the compiler, the Canonical Constructor initializes all fields with the values provided in the arguments
     * This constructor is generated implicitly and does not need explicit definition in the record's code
     * unless custom validation or initialization logic is required
     *
     * 2: Compact Constructor
     * This type of constructor is utilized when you want to add extra validation or manipulation
     * without having to manually assign each field, as that is implicitly handled
     *
     * 3: Custom Constructor
     * If more complex construction logic is needed or different ways of creating instances are necessary,
     * you can define additional constructors
     * These constructors must delegate to the canonical constructor
     */

    // Compact Constructor for the canonical form
    public PersonRecord {
        if (age <= 18) {
            throw new IllegalArgumentException("Person must be an adult");
        }
    }

    /*
     * Custom Constructor
     *
     *  For custom constructors, if we are accepting partial attributes as parameters, we must assign all the attributes
     * because all attributes are final implicitly
     */
    public PersonRecord(String name) {
        this(name, 0);
    }

    /*
     * public, protected, default and private access modifiers are allowed for variables
     *
     * only static, static-final variables are allowed
     * instance variable are attributes which must be declared as record parameters and are final implicitly
     *
     * In general, final variable is also an instance variable and static-final variable is a static variable, Hence
     * corresponding rules apply for final and static-final variables
     */
    private static String staticVariable;
    private static final String STATIC_FINAL_VARIABLE = "STATIC_FINAL_VARIABLE";

    /*
     * public, protected, default and private access modifiers are allowed for methods
     *
     * instance, static, final, static-final methods are allowed
     *
     * In general, final method is also an instance method and static-final method is a static method. Hence,
     * corresponding rules apply for final and static-final methods
     */
    public void instanceMethod() {
        System.out.println("This is an instance method in a record");
    }
    public static void staticMethod() {
        System.out.println("This is a static method in a record");
    }
    public final void finalMethod() {
        System.out.println("This is a final method in a record");
    }
    public static void staticFinalMethod() {
        System.out.println("This is a static-final method in a record");
    }

    public static void main(String[] args) {
        PersonRecord person = new PersonRecord("Harry", 20);

        System.out.println(person);
        System.out.println(person.name() + person.age());
        System.out.println();

        System.out.println(person.age);
        System.out.println(PersonRecord.staticVariable);
        System.out.println(PersonRecord.STATIC_FINAL_VARIABLE);
        System.out.println();

        person.instanceMethod();
        person.finalMethod();
        PersonRecord.staticMethod();
        PersonRecord.staticFinalMethod();
    }
}
