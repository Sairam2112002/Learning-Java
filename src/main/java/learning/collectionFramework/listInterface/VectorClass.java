package learning.collectionFramework.listInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        ArrayList<String> countryArrayList = VectorClass.createArrayList();

        // Creating a Vector
        Vector<String> countryVector1 = new Vector<>();
        Vector<String> countryVector2 = new Vector<>(5);
        Vector<String> countryVector3 = new Vector<>(5, 5);
        Vector<String> countryVector4 = new Vector<>(countryArrayList);

        System.out.println("After Creating Vectors:");
        System.out.println("Vector - 1: " + countryVector1);
        System.out.println("Vector - 2: " + countryVector2);
        System.out.println("Vector - 3: " + countryVector3);
        System.out.println("Vector - 4: " + countryVector4);
        System.out.println();

        // Capacity of the Vector
        System.out.println("Capacity of the Vector");
        System.out.println("Vector - 1: " + countryVector1.capacity());
        System.out.println("Vector - 2: " + countryVector2.capacity());
        System.out.println("Vector - 3: " + countryVector3.capacity());
        System.out.println("Vector - 4: " + countryVector4.capacity());
        System.out.println();

        // Adding elements
        countryVector1.add("Pakistan");
        countryVector1.add("Afghanistan");
        countryVector1.add(0, "Philippines");

        countryVector2.add("UAE");
        countryVector2.add("Australia");
        countryVector2.add(0, "Vietnam");

        countryVector3.add("Japan");
        countryVector3.add("South Korea");
        countryVector3.add(0, "North Korea");

        System.out.println("After Adding Elements");
        System.out.println("Vector - 1: " + countryVector1);
        System.out.println("Vector - 2: " + countryVector2);
        System.out.println("Vector - 3: " + countryVector3);
        System.out.println();

        // Adding Collections
        countryVector1.addAll(countryArrayList);
        countryVector1.addAll(0, countryArrayList);

        System.out.println("After adding an ArrayList:");
        System.out.println("Vector - 1: " + countryVector1);
        System.out.println();

        // Converting into an Array
        Object[] countries = countryVector1.toArray();

        System.out.println("Converting into an Array:");
        System.out.println("The Array is:");
        System.out.println(Arrays.toString(countries));
        System.out.println();

        // Retrieving Elements
        System.out.println("Retrieving Elements:");
        System.out.println("Vector - 1: " + countryVector1.get(0));
        System.out.println("Vector - 2: " + countryVector2.get(0));
        System.out.println("Vector - 3: " + countryVector3.get(0));
        System.out.println("Vector - 4: " + countryVector4.get(0));
        System.out.println();

        // Retrieving Indices
        System.out.println("Retrieving First Occurring Indices:");
        System.out.println("Vector - 1: " + countryVector1.indexOf("India"));
        System.out.println("Vector - 1: " + countryVector1.indexOf("Sri Lanka"));

        System.out.println("Retrieving Last Occurring Indices:");
        System.out.println("Vector - 1: " + countryVector1.lastIndexOf("India"));
        System.out.println("Vector - 1: " + countryVector1.lastIndexOf("Sri Lanka"));
        System.out.println();

        // Setting Elements
        countryVector1.set(3, "New Zealand");

        System.out.println("After Setting Elements:");
        System.out.println("Vector - 1: " + countryVector1);
        System.out.println();

        // Removing elements
        countryVector1.remove(4);
        countryVector1.remove("Sri Lanka");

        System.out.println("After Removing Elements:");
        System.out.println("Vector - 1: " + countryVector1);
        System.out.println();

        // Removing Collection
        countryVector1.removeAll(countryArrayList);

        System.out.println("After removing an ArrayList");
        System.out.println("Vector - 1: " + countryVector1);
        System.out.println();

        // Size of the Vector
        System.out.println("Size of the Vector:");
        System.out.println("Vector - 1: " + countryVector1.size());
        System.out.println("Vector - 2: " + countryVector2.size());
        System.out.println("Vector - 3: " + countryVector3.size());
        System.out.println("Vector - 4: " + countryVector4.size());
        System.out.println();

        // Extracting a Sub List
        countryVector1.addAll(countryArrayList);

        System.out.println("Extracting a Sub List");
        System.out.println("Sub List from Vector - 1: " + countryVector1.subList(1, 4));
        System.out.println();

        // Deleting all Elements from a Vector
        countryVector1.clear();

        System.out.println("After deleting all Elements:");
        System.out.println("Vector - 1: " + countryVector1);
        System.out.println();

        // Checking if the vector is Empty
        System.out.println("Is the Vector - 1 empty? " + countryVector1.isEmpty());
        System.out.println();

        // Checking if an Element is present
        countryVector1.addAll(countryArrayList);

        System.out.println("Checking for an Element if it is Present or Not:");
        System.out.println("Is \"India\" present in Vector - 1 ?: " + countryVector1.contains("India"));
        System.out.println();

        // Checking if a Collection is present
        System.out.println("Checking for a Collection if it is Present or Not:");
        System.out.println("Are all the Elements of Country ArrayList present in Vector - 1 ?: " + countryVector1.containsAll(countryArrayList));
        System.out.println();

        // ******************* Additional Methods *******************
        System.out.println("******************* Additional Methods *******************");
        System.out.println();

        // Getting First and Last Elements of the Vector
        System.out.println("Getting First and Last Elements of the Vector:");
        System.out.println("The First Element in Vector - 1 is: " + countryVector1.firstElement());
        System.out.println("The Last Element in Vector - 1 is: " + countryVector1.lastElement());
        System.out.println();

        // Setting size of the Vector
        System.out.println("Setting size of the Vector: ");
        System.out.println("Before setting size");
        System.out.println("Size of Vector - 1: " + countryVector1.size());

        countryVector1.setSize(20);

        System.out.println("After setting size");
        System.out.println("Size of Vector - 1: " + countryVector1.size());
        System.out.println("Vector - 1: " + countryVector1);
        System.out.println();
    }

    private static ArrayList<String> createArrayList() {
        ArrayList<String> countryArrayList = new ArrayList<>();
        countryArrayList.add("India");
        countryArrayList.add("Sri Lanka");
        countryArrayList.add("Philippines");
        countryArrayList.add("South Korea");
        return countryArrayList;
    }
}
