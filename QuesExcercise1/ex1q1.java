import java.util.*;
public class ex1q1 {
    public static double average(int a , int b , int c){
        return (double)(a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        double avg = average(a , b , c);
        System.out.println("The average is: " + avg);
    }
}