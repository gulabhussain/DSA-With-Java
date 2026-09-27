public class BitwiseOperator {
    public static void main(String[] args){
        int a=0110;
        int b=0010;
        int c=a&b;
        
        System.out.println(c);
        String binary = Integer.toBinaryString(c);
        System.out.println(binary);

        
    }        
    
}
