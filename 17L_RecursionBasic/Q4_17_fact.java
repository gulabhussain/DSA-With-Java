public class Q4_17_fact {
    public static void printFact(int n, int fact){
        if( n == 0){
            System.out.println(fact);
            return ;
        }
        fact *=n;
        printFact(n-1,fact);
    }
    public static void main ( String args[]){
        int n =5;
        int fact=1;
        printFact(n,fact);
    }
}
