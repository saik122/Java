import java.util.Scanner;
import java.util.Arrays;

public class LargestNumInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array elements");
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int LargestNumber = arr[0];
        int LargestNumberIndex = 0;
        for(int i=0; i<arr.length; i++) {
            if(LargestNumber < arr[i]) {
                LargestNumber = arr[i];
                LargestNumberIndex = i;
            }
        }
        System.out.println("LargestNumber : "+LargestNumber);
        System.out.println("LargestNumberIndex : "+LargestNumberIndex);
        sc.close();
    }
}
