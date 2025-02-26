package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    private static final List<Integer> integerList = new ArrayList<>();

    public static void filterOperation(List<String> stringList) {
        stringList.stream().filter(string -> string.length() >= 4).forEach(System.out::println);
    }

    public static void mapOperation(List<String> stringList) {
        stringList.stream().filter(string -> string.length() >= 5).map(string -> {
            String prefix = "First name = ";
            return prefix + string;
        }).forEach(System.out::println);
    }

    public static void sortedOperation(List<String> stringList) {
        stringList.stream().filter(string -> string.length() >= 4).sorted().forEach(System.out::println);
    }

    public static void forEachOperation(List<String> stringList) {
        stringList.stream().filter(string -> string.length() >= 4).forEach(System.out::println);
    }

    public static void collectOperation(List<String> stringList) {
        List<String> filteredList = stringList.stream().filter(string -> string.length() >= 4).collect(Collectors.toList());
        for(String string: filteredList) {
            System.out.println(string);
        }
    }

    /* Let’s break down the operation’s participant elements into separate blocks to understand each role easily
     *
     * Identity – an element that is the initial value of the reduction operation
     * and the default result if the stream is empty
     *
     * Accumulator – a function that takes two parameters:
     * a partial result of the reduction operation and the next element of the stream
     *
     * Combiner – a function used to combine the partial result of the reduction operation
     * when the reduction is parallelized or when there’s a mismatch between the types of the accumulator arguments
     * and the types of the accumulator implementation
     */
    public static void reduceOperation(List<Integer> integerList) {
        createIntegerList();

        int sumOfList = integerList.stream()
                .reduce(0, (total, currentNumber) -> total + currentNumber);
        System.out.println("Sum of integers = " + sumOfList);

        //  The above reduce operation can be simplified with a method reference as below
        sumOfList = integerList.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of integers = " + sumOfList);

        /*
         * Using a combiner when using parallel streams
         * In the below example, 0 is the identity, first (Integer::sum) is the accumulator, second one is combiner
         * Since the stream of integerList is divided into number of streams as we used parallel stream,
         * all the elements of individual streams are added using accumulator, and now we want the sum of all the
         * sums of individual streams which is specified by the accumulator
         */
        sumOfList = integerList.parallelStream()
                .reduce(0, Integer::sum, Integer::sum);
        System.out.println("Sum of list using parallel streams = " + sumOfList);
    }

    private static void createIntegerList() {
        for(int i = 1; i <= 1000; i++) {
            integerList.add(i);
        }
    }

    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("John", "Jane", "Adam", "Tom", "Eve", "Anna", "Mike", "Jennifer");

        /* Intermediate Operations
         *
         */
        System.out.println("filter Operation:");
        filterOperation(namesList);
        System.out.println();

        System.out.println("map Operation:");
        mapOperation(namesList);
        System.out.println();

        System.out.println("sorted Operation:");
        sortedOperation(namesList);
        System.out.println();

        /* Intermediate Operations
         *
         */
        System.out.println("forEach Operation:");
        forEachOperation(namesList);
        System.out.println();

        System.out.println("collect Operation:");
        collectOperation(namesList);
        System.out.println();

        System.out.println("reduce Operation:");
        reduceOperation(integerList);
        System.out.println();
    }
}
