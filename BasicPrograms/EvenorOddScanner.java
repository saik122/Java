package BasicPrograms;
import java.util.Scanner;
public class EvenorOddScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.printf("enter an integer : ");
            int number = scan.nextInt();

            if (number % 2 == 1) {
                System.out.println(" odd number : " + number);
            } else {
                System.out.println(" even number: " + number);
            }
        }

    }
}
