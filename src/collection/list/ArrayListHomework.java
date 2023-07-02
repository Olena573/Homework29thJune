import java.util.ArrayList;

public class ArrayListHomework {
    // Here we work with the array list from the task 3 (and in a class created for it)
    public static void main(String[] args) {

        ArrayList<Integer> someList = new ArrayList<>(10);
        for (int i = 0; i < 11; i++) {
            // here we fill the list;
            someList.add(i + 5);
            // here we remove 3 vaalues from the list;
            someList.remove(2);
            someList.remove(5);
            someList.remove(8);
            // Here we replace an element of a list with another value;
            someList.set(1, 12);
        }
        System.out.println(someList);


    }
}
