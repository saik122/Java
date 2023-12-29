package ExceptionHandling;

public class ArrayoutofIndex {
    public static void main(String[] args) {
        try{

        int arr[]={2,5,10};
        System.out.println(arr);
        try{
            arr[5]=5/0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
            arr[3]=6;
            arr[4]=15;
    }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
    }

}
