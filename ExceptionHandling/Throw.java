package ExceptionHandling;

public class Throw {
    public static void vote(int age) {
        if(age<18){
            throw new ArithmeticException("your not eligible");
        }
        else{
            System.out.println("your eligible for vote");
        }

    }

    public static void main(String[] args) {
        vote(18);
        System.out.println("complete");
    }
}
