package Inheritance;

class Animal{
    void dog(){
        System.out.println("eating");
    }
}
class Animals extends Animal {
    void dog() {
        super.dog();
        System.out.println("barking");

    }
}
    public class SuperKeyword {
    public static void main(String[] args) {
     Animals obj=new Animals();
     obj.dog();


    }
}
