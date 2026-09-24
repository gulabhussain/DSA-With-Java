
import java.util.*;

public class Ex1Q4 {

    // Function to calculate circumference
    static double circumference(int r) {

        return 2 * 3.14159 * r;//Math.PI=
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        double result = circumference(r);

        System.out.println("Circumference = " + result);
    }
}
