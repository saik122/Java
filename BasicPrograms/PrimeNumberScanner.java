package BasicPrograms;
import java.util.Scanner;

public class PrimeNumberScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number: ");
                int number=scan.nextInt();
               int count=0;
                for(int i=1;i<=number;i++){
                    if(number % i==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.println("prime number "+number);

                }else{
                    System.out.println("it is not a primenumber "+number);

                }

    }
}
