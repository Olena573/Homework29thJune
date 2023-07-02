package collection.list;
import java.util.ArrayList;
import java.util.List;


public class ArrayListHomework {
    // Here we work with the array list from the task 3 (and in a class created for it)
    public static void main(String[] args) {
        int [] array = new int [] {};

        ArrayList<Integer> someList = new ArrayList<>(10);
        for (int i = 0; i < 11; i++) {
            // here we fill the list;
            someList.add(i + 5);

        }
        // here we printed out a created list.
        System.out.println(someList);

        // here we remove 3 values from the list;
        someList.remove(2);
        someList.remove(5);
        someList.remove(8);
        // here we printed out a created list.
        System.out.println(someList);
        // Here we replace an element of a list with another value;
        someList.set(1, 12);
        // here we printed out a created list.
        System.out.println(someList);


    }
}
