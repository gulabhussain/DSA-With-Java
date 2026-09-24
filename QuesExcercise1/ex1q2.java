
import java.util.Scanner;
public class ex1q2 {
    public static void sumOfOdd(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum = sum + i;
            }    
        }
        System.out.println("Sum of odd numbers up to " + n + " is: " + sum);
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sumOfOdd(n);
    }
}
