import java.util.*;
public class Ex1Q8 {

    // Function to calculate x raised to power n
    static long power(int x, int n) {

        long result = 1;

        for (int i = 1; i <= n; i++) {

            result = result * x;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(x + " raised to the power " + n + " = " + (power(x, n)));
    }
}

