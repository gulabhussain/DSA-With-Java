import java.util.Scanner;
public class even {
    public static void checkEvenOdd(int n){
        if(n%2!=0)
            System.out.println(n + " is odd.");
        else
            System.out.println(n + " is even.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        checkEvenOdd(n);
    }
}
