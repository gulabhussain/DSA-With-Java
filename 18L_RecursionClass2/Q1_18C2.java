

public class Q1_18C2 {
    public static void towerOfHonai(int n, String src, String helper, String dest){
        if (n==1){
            System.out.println("transfer disk " + n + " from " + src + " to "+dest);
            return;
        } 

        towerOfHonai(n-1,src , dest , helper);
        System.out.println("transfer disk " + n + " from " + src + " to "+dest);
         towerOfHonai(n-1,helper , src , dest);

    }
    public static void main ( String[] args){
        int n=3;
        towerOfHonai(n, "S" , "H" , "D");
        
    }
    
}
