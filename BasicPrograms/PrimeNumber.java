package BasicPrograms;

public class PrimeNumber {

    public static void main(String[] args) {
        int num=3;
        int count=0;
        for(int i=1;i<=num;i++){
            if(num % i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime number: "+num);
        }
        else{
            System.out.println("it is not prime number: "+num);

        }

    }
}



