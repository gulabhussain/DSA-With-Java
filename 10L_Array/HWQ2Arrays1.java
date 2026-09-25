//public class HWQ2Arrays1 {
//Find the maximum & minimum number in an array of integers.  [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java] 

import java.util.*;

public class HWQ2Arrays1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Take array size as input
        System.err.println("Enter the size of array :");
        int size = sc.nextInt();

        // Create an array
        int numbers[] = new int[size];

        // Take array elements as input
        System.err.println("Enter The element of the array :");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Initialize maximum and minimum
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find maximum and minimum
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print result
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);

        sc.close();
    }
}