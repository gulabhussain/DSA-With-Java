public class Q3_tilingProblem {
    public static int placeTiles(int n , int m){
        if (n==m){
            return 2;
        }
        if (n<m){
            return 1;
        }
        // place tile vertically
        int vertical = placeTiles(n-m,m);
        // place tile horizontally
        int horizontal = placeTiles(n-1,m);
        return vertical + horizontal;
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(placeTiles(n, m));
    }
    
}
