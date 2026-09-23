import java.util.*;

public class checkPrime {

    static void checkPrime(int n) {
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }

        System.out.println("Prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        checkPrime(n);
    }
}