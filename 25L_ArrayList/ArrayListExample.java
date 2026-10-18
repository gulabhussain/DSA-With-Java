
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {

        // Integer ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        
        // String ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        
        // Boolean ArrayList
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Adding integer values
        list1.add(5);
        list1.add(10);

        // Adding string values
        list2.add("Hello");
        list2.add("World");

        // Adding boolean values
        list3.add(true);
        list3.add(false);

        // Printing ArrayLists
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        //get element
        int element = list1.get(0);
        System.out.println("Element at index 0 in list1: " + element);

        //add in b/w
        list1.add(1, 15);
        System.out.println("After adding 15 at index 1 in list1: " +list1);

        //set element
        list1.set(0, 20);
        System.out.println("After setting element at index 0 in list1: " + list1);

        //remove element
        list1.remove(2);
        System.out.println("After removing element at index 2 in list1: " + list1);

        //size of arraylist
        int size = list1.size();
        System.out.println("Size of list1: " + size);

        // loop 
        for(int i=0; i<list1.size(); i++){
            System.out.println("Element at index " + i + ": " + list1.get(i));
        }

        // sorting
        Collections.sort(list1);
        System.out.println("After sorting list1: " + list1);
    }
}

