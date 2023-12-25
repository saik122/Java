package Inheritance;

class Student{
    void name(){
        System.out.println("Name: Saikumar");
    }
}
class studId extends Student{
    void id(){
        System.out.println("Rollno: c9");
    }
}
class Department extends Student{
    void department(){
        System.out.println("MCA");
    }
}

public class HierarichicalInheritance {
    public static void main(String[] args) {
        Department m=new Department();
        m.name();
        m.department();
        System.out.println("------------------------------");
        studId obj=new studId();
        obj.name();
        obj.id();
    }
}
