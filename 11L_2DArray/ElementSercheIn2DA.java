//public class ElementSercheIn2DA {

import java.util.*;
public class ElementSercheIn2DA {
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
        System.err.println("Search Your element :");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {//row
            for (int j=0; j<cols; j++){//col
                //compare
                if(numbers[i][j] == x){
                    System.err.println("x found at locations :  [" + i + ","+ j + "]");
                }
            }
            
        }
    }
    
}