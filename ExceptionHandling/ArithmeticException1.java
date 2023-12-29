package ExceptionHandling;

public class ArithmeticException1 {
    public static void main(String[] args) {
        try {
            int a = 100;
            int b = 0;
            int c = a / b;
            System.out.println(a);
            System.out.println(b);

           System.out.println(c);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);

        }
        finally {
            System.out.println("Whether exception handled or not");
        }

        System.out.println("rest of the code");

    }
}
