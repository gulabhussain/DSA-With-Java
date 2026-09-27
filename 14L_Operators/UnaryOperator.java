public interface UnaryOperator {
    public static void main(String[] args){
        int a=5;
        int b=10; 
       b = ++a;//6
       //b = a++; //5
        System.out.println(a);
        System.out.println(b);
        System.out.println(a++);
        System.out.println(++b);
    }               
}
