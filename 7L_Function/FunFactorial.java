import java.util.*;
public class FunFactorial {
    public static void printFactorial(int n){
        if (n<= 0){
            System.out.println("Factorial is not defined for negative numbers or zero.");
            return;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + n + " is: " + factorial);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printFactorial(n);
    }
}
