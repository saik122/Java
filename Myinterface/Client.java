package Myinterface;

public class Client implements ATM{

    public void createAccount(){
     System.out.println("create an bank account");
    }

    public void deposit(){
        System.out.println("client deposited an amount in the bank");
    }
   public void withdrawl(){
        System.out.println("client can be withdrawl an amount");
    }

    public void ATMcard(){
        System.out.println("scan your ATM card");
    }
    public void pinNumber(){
        System.out.println("enter your pin number");
    }
    public void withdrawn(){
        System.out.println("enter your withdrawl amount");
    }
    public void balance_Enquiry(){
        System.out.println("check your balance");
    }

    public static void main(String[] args) {

        Client bank = new Client();
        bank.createAccount();
        bank.deposit();
        bank.withdrawl();
        bank.ATMcard();
        bank.pinNumber();
        bank.withdrawn();
        bank.balance_Enquiry();
    }

}
