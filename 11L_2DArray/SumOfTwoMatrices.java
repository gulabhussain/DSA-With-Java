import java.util.*;

public class SumOfTwoMatrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Row and column size
        System.out.println("Enter Row Size:");
        int rows = sc.nextInt();

        System.out.println("Enter Column Size:");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        int[][] diff = new int[rows][cols];

        // Input Matrix 1
        System.out.println("Enter elements of Matrix 1:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input Matrix 2
        System.out.println("Enter elements of Matrix 2:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Add two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                diff[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Print result
        System.out.println("Sum of two matrices:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Difference of two matrices:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}