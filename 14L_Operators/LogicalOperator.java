public class LogicalOperator {
    public static void main(String[] args){
        int a=5;
        int b=10; 
        int c=4;
        int d=4;
        // AND
        System.out.println((a<b) && (c==d) );//true
        System.out.println((a>b) && (c==d) );
        //OR
        System.out.println((a<b) || (c==d) );
        System.out.println((a>b) || (c==d) );
        System.out.println((a>b) || (c!=d) );
        // Not
        System.out.println(!(a>b) );

    }           
}
