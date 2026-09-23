import java.util.*;
public class TableF {
    public static void printTable(int n){
        for (int i=0; i<11; i++){
            int result = n*i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printTable(n);
    }
}
