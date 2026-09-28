import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner gulab = new Scanner(System.in);
        System.out.println("Enter (0 , 1),  0 for (1 -> 0) , 1 for (0 -> 1) :");
        int x = gulab.nextInt();
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        
        if (x==1){ // set operation
            int newNum = bitMask |n;
            System.out.println(newNum);
        } else { // clear operation
            int notBitMask = ~(bitMask);
            int result = notBitMask & n;
            System.out.println(result);

        }
    }
    
}
