package learning.collectionFramework.listInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> secondaryArrayList = ArrayListClass.createArrayList();

        // Creating an ArrayList
        ArrayList<String> countryArrayList1 = new ArrayList<>();
        ArrayList<String> countryArrayList2 = new ArrayList<>(5);
        ArrayList<String> countryArrayList3 = new ArrayList<>(secondaryArrayList);

        System.out.println("After creating ArrayList:");
        System.out.println("ArrayList - 1: " + countryArrayList1);
        System.out.println("ArrayList - 2: " + countryArrayList2);
        System.out.println("ArrayList - 3: " + countryArrayList3);
        System.out.println();

        // Adding Elements
        countryArrayList1.add("Canada");
        countryArrayList1.add("USA");
        countryArrayList1.add(0, "Mexico");

        countryArrayList2.add("England");
        countryArrayList2.add("Ireland");
        countryArrayList2.add(0, "Scotland");

        countryArrayList3.add("Italy");
        countryArrayList3.add("Spain");
        countryArrayList3.add(0, "France");

        System.out.println("After adding elements: ");
        System.out.println("ArrayList - 1: " + countryArrayList1);
        System.out.println("ArrayList - 2: " + countryArrayList2);
        System.out.println("ArrayList - 3: " + countryArrayList3);
        System.out.println();

        // Adding Collections
        countryArrayList1.addAll(secondaryArrayList);
        countryArrayList1.addAll(0, secondaryArrayList);

        System.out.println("After adding an ArrayList");
        System.out.println("ArrayList - 1: " + countryArrayList1);
        System.out.println();

        // Converting into an Array
        Object[] countries = countryArrayList1.toArray();

        System.out.println("Converting into an Array:");
        System.out.println("The Array is:");
        System.out.println(Arrays.toString(countries));
        System.out.println();

        // Retrieving Elements
        System.out.println("Retrieving Elements: ");
        System.out.println("ArrayList - 1: " + countryArrayList1.get(0));
        System.out.println("ArrayList - 2: " + countryArrayList2.get(0));
        System.out.println("ArrayList - 3: " + countryArrayList3.get(0));
        System.out.println();

        // Retrieving Indices
        System.out.println("Retrieving First Occurring Indices: ");
        System.out.println("ArrayList - 1: " + countryArrayList1.indexOf("India"));
        System.out.println("ArrayList - 1: " + countryArrayList1.indexOf("Sri Lanka"));

        System.out.println("Retrieving Last Occurring Indices:");
        System.out.println("ArrayList - 1: " + countryArrayList1.lastIndexOf("India"));
        System.out.println("ArrayList - 1: " + countryArrayList1.lastIndexOf("Sri Lanka"));
        System.out.println();

        // Setting Elements
        countryArrayList1.set(3, "New Zealand");

        System.out.println("After Setting Elements");
        System.out.println("ArrayList - 1: " + countryArrayList1);
        System.out.println();

        // Removing Elements
        countryArrayList1.remove(4);
        countryArrayList1.remove("Sri Lanka");

        System.out.println("After Removing Elements:");
        System.out.println("ArrayList - 1: " + countryArrayList1);
        System.out.println();

        // Removing Collection
        countryArrayList1.removeAll(secondaryArrayList);

        System.out.println("After removing an ArrayList");
        System.out.println("ArrayList - 1: " + countryArrayList1);
        System.out.println();

        // Size of the ArrayList
        System.out.println("Sizes of ArrayLists:");
        System.out.println("ArrayList - 1: " + countryArrayList1.size());
        System.out.println("ArrayList - 2: " + countryArrayList2.size());
        System.out.println("ArrayList - 3: " + countryArrayList3.size());
        System.out.println();

        // Extracting a Sublist
        countryArrayList1.addAll(secondaryArrayList);

        System.out.println("Extracting a Sublist:");
        System.out.println("Sub List from ArrayList - 1: " + countryArrayList1.subList(1, 4));
        System.out.println();

        // Deleting all Elements form an ArrayList
        countryArrayList1.clear();

        System.out.println("After deleting all Elements:");
        System.out.println("ArrayList - 1: " + countryArrayList1);
        System.out.println();

        // Checking if the ArrayList is Empty
        System.out.println("Is the ArrayList - 1 Empty? " + countryArrayList1.isEmpty());

        // Checking if an Element is present
        countryArrayList1.addAll(secondaryArrayList);

        System.out.println("Checking for an Element if it is Present or Not:");
        System.out.println("Is \"India\" present in ArrayList - 1 ?: " + countryArrayList1.contains("India"));
        System.out.println();

        // Checking if a Collection is present
        System.out.println("Checking for a Collection if it is Present or Not:");
        System.out.println("Are all the Elements of Secondary ArrayList present in ArrayList - 1 ?: " + countryArrayList1.containsAll(secondaryArrayList));
        System.out.println();
    }

    private static ArrayList<String> createArrayList() {
        ArrayList<String> countryArrayList = new ArrayList<>();
        countryArrayList.add("India");
        countryArrayList.add("Sri Lanka");
        return countryArrayList;
    }
}
