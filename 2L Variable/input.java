import java.util.*;

public class input {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
         //String name ="Gulab Hussain";
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        //sc.close();
    }
}