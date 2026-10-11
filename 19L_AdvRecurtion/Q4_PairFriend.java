public class Q4_PairFriend {
    public static int callguest(int n){
        if( n<=1){
            return 1;
        }
        ///int ways1= n-1;
        //int ways2= (n-1)*callguest(n-2);
        return callguest(n-1) + (n-1)*callguest (n-2);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(callguest(n));
    }
    
}
