import java.util.*;
public class strFromUser {
    public static void main(String[] args){
        Scanner gulab = new Scanner(System.in);
        System.out.println("Enter Your  firstName :");
        String firstName = gulab.nextLine();
        System.out.println("Enter Your lastName :");
        String lastName = gulab.nextLine();

        // concenate
        String name = firstName + " " + lastName;
        System.out.println("Your Name is : "+ name);

        //length of string
        System.out.println("Length of Your Name is : "+ name.length());
        // Access character 
        System.out.println("The all Characters are : ");
        for(int i=0; i<name.length(); i++ ){
            System.out.println(name.charAt(i));
        }

    }
    
}// perform important function
