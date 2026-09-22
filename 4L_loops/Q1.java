// print the sum of first n natural numbers
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
    
}
