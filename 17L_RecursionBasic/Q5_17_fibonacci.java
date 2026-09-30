public class Q5_17_fibonacci {
    public static void printFibonacci(int a, int b, int n){
        if (n==0){
            return;
        }
        System.out.println(a + " ");
        printFibonacci(b, a+b ,n-1);
    }
    public static void main(String[] args) {
        int n = 12;
        int a = 0;
        int b = 1;
        printFibonacci(a,b,n);
    }
    
}
