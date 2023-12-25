package Operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
       System.out.println("Biwise AND : " +(a&b));
        System.out.println("Biwise OR : " +(a|b));
        System.out.println("Biwise NOT/complement : " +(~a));
        System.out.println("Biwise exclusive OR : " +(a^b));
        System.out.println("Biwise Leftshift : " +(a<<2));
        System.out.println("Biwise RightShift : " +(a>>2));
        System.out.println("Biwise unsigned Rightshift : " +(a>>>2));
    }
}