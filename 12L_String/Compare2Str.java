//public class Compare2Str {
import java.util.*;
public class Compare2Str {
    public static void main(String[] args){
        Scanner gulab = new Scanner(System.in);
        System.out.println("Enter Your  first String :");
        String firststr = gulab.nextLine();
        System.out.println("Enter Your Second String :");
        String secondstr = gulab.nextLine();

        // comparing
        if(firststr.compareTo(secondstr) == 0){
        //if(firststr.equals(secondstr)){ //do use this
        //if(firststr == secondstr){    do not use this
            System.out.println("They are same string : ");
        } else {
            System.out.println("They are not same string : ");
        }
        
    }
    
}// perform important function
    
