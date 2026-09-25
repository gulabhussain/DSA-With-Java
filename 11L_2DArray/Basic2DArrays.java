//Basic
// public class Basic2DArrays {
//     public static void main (String[] args){
//         int marks[][] = new int[2][2];
//         marks[0][0] = 80;  
//         marks[0][1] = 70;
//         marks[1][0] = 60;
//         marks[1][1] = 90;
//         for (int i = 0; i < 2; i++) {
//             for (int j=0; j<2; j++){
//                 System.err.println(marks[i][j]);
//             }
//         }
//     }
    
// }
import java.util.*;
public class Basic2DArrays {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Row Size :");
        int rows = sc.nextInt();
        System.out.println("enter Column Size :");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        //input2

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {//row
            for (int j=0; j<cols; j++){//col
                numbers[i][j] = sc.nextInt();
            }
        }
        
        //output
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < rows; i++) {//row
            for (int j=0; j<cols; j++){//col
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
    
}