public class PatternAQ4{
    public static void main(String[] args) {
        int n= 5;
        //int num = 1;
        for (int i=1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){ //  space
                System.out.print(" ");
            }
            
            for (int j=i; j>=1; j--){
                System.out.print(j); //* */
                //num++;
            }
            for (int j=2; j<=i; j++){
                System.out.print(j); //* */
                //num++;
            }
            System.out.println();
        }
    }
}
