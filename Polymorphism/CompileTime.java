package Polymorphism;

public class CompileTime {
    void product(String laptop){

        System.out.println(laptop);
    }
    void product(int price){
        System.out.println(price);}


    void product( String rate ,int price){

        System.out.println(rate+price);
    }

}

