package Operators;

public class UnaryOperator {
    public static void main(String[] args) {
        int a= 10;
        int b= -20;
        System.out.println("-20 convert into (unary)plus : " + -b);
        System.out.println("+10 convert into (unary)minus : " + -a);
        System.out.println("post increment :" + a++);
        System.out.println("After the post increment :" + a);
        System.out.println("post decrement :" + a--);
        System.out.println("After the post decrement :" + a);
        System.out.println("------------------------------------");
        System.out.println("Pre increment : " + (++a));
        System.out.println("Pre decrement : " + (--a));

    }
}
