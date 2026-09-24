
import java.util.*;

public class ex1q3 {

    // Function to return greater number
    static int greaterNumber(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = greaterNumber(a, b);

        System.out.println("Greater number = " + result);

        sc.close();
    }
}

