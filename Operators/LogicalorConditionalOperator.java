package Operators;

public class LogicalorConditionalOperator {
    public static void main(String[] args) {
        int num1=56;
        int num2=66;
        boolean a=true;
        boolean b=false;
        //logical AND
        System.out.println("Logical AND : " + (num1<num2 && num1==num2));
        System.out.println("Logical AND : " + (num1<num2 && num2>=num1));

        //Logical OR
        System.out.println("Logical OR : " + (num1<num2 || num1==num2));
        System.out.println("Logical AND : " + (num1<num2 || num1==num2));
        System.out.println("Logical AND : " + (num1==num2 || num1>=num2));

        //Logical NOT
        System.out.println("Logical NOT : " + (!a));
        System.out.println("Logical NOT : " + (!b));


    }
}
