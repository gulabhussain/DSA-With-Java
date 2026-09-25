//public class HWQ3Array1 {
//Take an array of numbers as input and check if it is an array sorted in ascending order.
//  Eg : 
// { 1, 2, 4, 7 } is sorted in ascending order.        
// {3, 4, 6, 2} is not sorted in ascending order.   

import java.util.*;

public class HWQ3Array1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Take array size as input
        int size = sc.nextInt();

        // Create an array
        int numbers[] = new int[size];

        // Take array elements as input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Assume array is sorted
        boolean isAscending = true;

        // Check adjacent elements
        for (int i = 0; i < size - 1; i++) {

            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
                break;
            }
        }

        // Print result
        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

        sc.close();
    }
}