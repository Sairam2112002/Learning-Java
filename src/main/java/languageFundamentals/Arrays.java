package languageFundamentals;

public class Arrays {
    public static void main(String[] args) {
        // 1. Array Declaration

        int[] oneDimensionalArray1;
        int[][] twoDimensionalArray1;
        int [][][] threeDimensionalArray1;

        // 2. Array Creation

        oneDimensionalArray1 = new int[2];
        twoDimensionalArray1 = new int[2][2];
        threeDimensionalArray1 = new int[2][2][2];

        // Not specifying the size of higher dimensions

        twoDimensionalArray1 = new int[2][];
        twoDimensionalArray1[0] = new int[2];
        twoDimensionalArray1[1] = new int[2];

        threeDimensionalArray1 = new int[2][2][];
        threeDimensionalArray1[0][0] = new int[2];
        threeDimensionalArray1[0][1] = new int[3];
        threeDimensionalArray1[1][0] = new int[4];
        threeDimensionalArray1[1][1] = new int[5];

        threeDimensionalArray1 = new int[2][][];
        threeDimensionalArray1[0] = new int[2][];
        threeDimensionalArray1[1] = new int[2][];
        threeDimensionalArray1[0][0] = new int[50];
        threeDimensionalArray1[0][1] = new int[55];
        threeDimensionalArray1[1][0] = new int[49];
        threeDimensionalArray1[1][1] = new int[52];

        // 3. Array Declaration - Creation - Initialization

        int[] oneDimensionalArray2 = {1,2,3,4};
        int[][] twoDimensionalArray2 = {{1,2,3,4}, {5,6,7,8}};
        int [][][] threeDimensionalArray2 = {{{1,2,3,4}, {5,6,7,8}}, {{9,10,11,12}, {13,14,15,16}}};

        // If the Array is already declared, then we can only initialize using "new int[]{}", not directly by using "{}"

        oneDimensionalArray1 = new int[]{1,2,3,4};
        twoDimensionalArray1 = new int[][]{{1,2,3,4}, {5,6,7,8}};
        threeDimensionalArray1 = new int[][][]{{{1,2,3,4}, {5,6,7,8}}, {{9,10,11,12}, {13,14,15,16}}};

        // 4. Anonymous Arrays

        for(int number: new int[]{1,2,3,4}) {
            System.out.print(number + ", ");
        }
        System.out.println("\n");

        for(int[] oneDimensionalArray: new int[][]{{1,2,3,4}, {5,6,7,8}}) {
            for(int number: oneDimensionalArray) {
                System.out.print(number + ", ");
            }
            System.out.println();
        }
        System.out.println();

        for(int[][] twoDimensionalArray: new int[][][]{{{1,2,3,4}, {5,6,7,8}}, {{9,10,11,12}, {13,14,15,16}}}) {
            for(int[] oneDimensionalArray: twoDimensionalArray) {
                for(int number: oneDimensionalArray) {
                    System.out.print(number + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
