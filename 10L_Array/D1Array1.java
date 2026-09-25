import java.util.*;
public class D1Array1 {
    public static void main (String[] args){
        //int marks[] = new int[5];
        // marks[0] = 90;
        // marks[1] = 80;  
        // marks[2] = 70;
        // marks[3] = 60;
        // marks[4] = 50;
        
        // int marks[] = {90, 80, 70, 60, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + "");
        }
    }
    
}
