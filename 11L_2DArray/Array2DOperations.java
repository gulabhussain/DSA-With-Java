import java.util.*;

public class Array2DOperations {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Take rows and columns
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        // Create 2D array
        int numbers[][] = new int[rows][cols];

        // Input elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Variables
        int sum = 0;
        int product = 1;
        int difference = numbers[0][0];

        // Calculate sum, product and difference
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                sum = sum + numbers[i][j];

                product = product * numbers[i][j];

                if (i != 0 || j != 0) {
                    difference = difference - numbers[i][j];
                }
            }
        }

        // Print results
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Difference = " + difference);

        sc.close();
    }
}