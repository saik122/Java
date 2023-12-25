package Inheritance;

class Dog {
    void name(){
        System.out.println("jack");
    }
}
    class Child extends Dog {
        void eat() {
            System.out.println("eating");
        }
    }
       public class SingleInheritance{
            public static void main(String[] args) {
                Child obj=new Child();
                  obj.name();
                  obj.eat();

            }
        }

