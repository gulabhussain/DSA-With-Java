import java.util.Scanner;

public class Ex1Q5 {

    // Function to check voting eligibility
    public static boolean isEligible(int age) {

        if (age > 18) {
            System.out.println("You are eligible to vote.");
            return true;
        } else {
            System.out.println("You are not eligible to vote.");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        isEligible(age);

        sc.close();
    }
}