public class PatternQ1{
    public static void main(String[] args) {
        int n= 4;
        // upper half
        for (int i=1; i<=n; i++){
            for (int j = 1; j<=i; j++){ // first *
                System.out.print("*");
            }
            int space = 2*(n-i); //printing space
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++){ // second *
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i=n; i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
