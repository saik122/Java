package Exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        int x = 9;
        int y = 1;
        int z = 0;
        try {
            z = x/y;
        }
        catch (ArithmeticException ae) {
            System.out.println(ae);
        }
        finally {
            System.out.println("Final result");
        }
        System.out.println("Output :"+z);
    }
    
}
