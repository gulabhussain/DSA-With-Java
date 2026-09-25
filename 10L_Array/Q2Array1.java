
import java.util.*;
public class Q2Array1 {
    public static void main (String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
    
        //output
        System.err.println("Enter number for searching :");
        int x = sc.nextInt();
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == x){
                System.err.println("x Found al index :"+ i);
            }
        }
    }
}
