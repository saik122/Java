package collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList l= new ArrayList();

        l.add(10);
        l.add(20.34);
        l.add(10);
        l.add(null);
        l.add("java");
        System.out.println("List=" + l);
        System.out.println("List of index size=" + l.size());
        System.out.println("index2 =" + l.get(2));
        l.remove(1);
        System.out.println(l);
        l.clear();
        System.out.println("list is empty =" +l.isEmpty());
        System.out.println("-------------------------");
        ArrayList x= new ArrayList();
        x.add(145);
        x.add(25);
        x.add(784);
        x.add(null);
        x.add(48.24);
        System.out.println("List2=" + x);
        System.out.println("index number = "+ x.indexOf(784));
        System.out.println("index number = "+ x.indexOf(25));
        System.out.println("last index = "+ x.lastIndexOf(48.24));


    }
}
