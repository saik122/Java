package Polymorphism;

public class Implement extends RunTimePolymorphism {
    public static void main(String[] args) {
        Implement vv=new Implement();
        vv.bike();
        RunTimePolymorphism obj=new Runtime2();
        obj.bike();
        RunTimePolymorphism obj1 =new Runtime3();
        obj1.bike();
        RunTimePolymorphism obj2 =new RunTimePolymorphism();
        obj2.bike();
    }
}
