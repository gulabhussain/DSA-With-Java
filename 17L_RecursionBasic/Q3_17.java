
//print sum of first n natural number
import java.util.*;
public class Q3_17 {
    public static void printSum(int n, int sum) {
        if (n==0){
            System.out.println(sum);
            return;
        }
        sum +=n;
        printSum(n-1 , sum);
        
    }
    public static void main(String[] args) {
        Scanner gulab = new Scanner(System.in);
        System.out.println(" Enter Number :");
        int n = gulab.nextInt();
        int sum=0;
        printSum(n,sum);
    }
    
}
