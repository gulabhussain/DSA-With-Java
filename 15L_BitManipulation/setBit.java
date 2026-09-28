public class setBit {
    
    public static void main(String[] args){
        int n = 5;//0101
        int pos = 1;
        int bitMask = 1<<pos;//
        int newnum = bitMask | n;
        
        System.out.println(newnum);

        String binary = Integer.toBinaryString(newnum);
        System.out.println(binary);
        
    }
    
}


