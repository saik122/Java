package ExceptionHandling;

public class Throws {
    static void disp() throws ArithmeticException{
      int a=3/0;
      System.out.println(a);
    }
    public static void main(String[] args) {
        try{
        disp();
    }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("complete");
    }
}

