
import java.util.Scanner;
public class HW_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");

        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter operation (1-5):");
        int operaton = sc.nextInt();
        switch(operaton){
            case 1: System.out.println((a+b));
            break;
            case 2: System.out.println((a-b));
            break;
            case 3 : System.out.println((a*b));
            break;
            case 4:if(b==0){
                System.out.println("Invalid operation");
            } else {
                System.out.println((a/b));
            }
            case 5:if(b==0){
                System.out.println("Invalid operation");
            } else {
                System.out.println((a%b));
            }
            default : System.out.println("Invailid operator");    
       
        }
    }
}
