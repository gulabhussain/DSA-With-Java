public class Q7_17power {
    public static int calculatePower(int x, int n){
         if (n==0){
            return 1;
         }
         if (n%2==0){ // n is even
            return calculatePower(x,n/2) * calculatePower(x,n/2);
         } else {
            return x * calculatePower(x,n/2) * calculatePower(x,n/2);
         }

    }
    
    public static void main(String[] args) {
        int x =2 , n=5;
        int output = calculatePower(x,n);
        System.out.println(output);
    }
}
