package languageFundamentals;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Primitive Data Types:" + "\n");
        System.out.println("Data Type | Size (in bytes) | Range");
        System.out.println("-----------------------------------");
        System.out.println("byte      | " + ((Byte.SIZE) / 8) + "               | " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short     | " + ((Short.SIZE) / 8) + "               | " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int       | " + ((Integer.SIZE) / 8) + "               | " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long      | " + ((Long.SIZE) / 8) + "               | " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float     | " + ((Float.SIZE) / 8) + "               | " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double    | " + ((Double.SIZE) / 8) + "               | " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("boolean   | " + "NA" + "              | " + "NA [allowed values = true / false]");
        System.out.println("char      | " + ((Character.SIZE) / 8) + "               | " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
    }

    // Output
    /*
     Primitive Data Types:

     Data Type | Size (in bytes) | Range
     -----------------------------------
     byte      | 1               | -128 to 127
     short     | 2               | -32768 to 32767
     int       | 4               | -2147483648 to 2147483647
     long      | 8               | -9223372036854775808 to 9223372036854775807
     float     | 4               | 1.4E-45 to 3.4028235E38
     double    | 8               | 4.9E-324 to 1.7976931348623157E308
     boolean   | NA              | NA [allowed values = true / false]
     char      | 2               | 0 to 65535
     */
}
