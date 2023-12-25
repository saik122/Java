package Inheritance;

class Employee{
    void name(){
        System.out.println("Saikumar");
    }
}
class Id extends Employee{
    void empid(){
        System.out.println("255dt");
    }
}
class companyname extends Id{
    void companyname(){
        System.out.println("Ovaledge");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        companyname obj=new companyname();
        obj.name();
        obj.empid();
        obj.companyname();
    }
}
