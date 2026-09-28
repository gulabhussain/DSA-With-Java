public class ClearBit {
    public static void main(String[] args){
        int n = 5;//0101
        int pos = 2;
        int bitMask = 1<<pos;//
        int notbitMask = ~(bitMask);
        int result = notbitMask & n;
        
        System.out.println(result);
        
        // String binary = Integer.toBinaryString(result);
        // System.out.println(binary);
        
        
    }
}
