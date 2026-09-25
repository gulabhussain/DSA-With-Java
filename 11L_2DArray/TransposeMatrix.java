import java.util.*;

public class TransposeMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take rows and columns
        System.out.println("Enter Row Size:");
        int rows = sc.nextInt();

        System.out.println("Enter Column Size:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        // Input matrix
        System.out.println("Enter elements of matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        // Find transpose
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                transpose[j][i] = matrix[i][j];
            }
        }

        // Print transpose
        System.out.println("Transpose of matrix:");

        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows; j++) {

                System.out.print(transpose[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}