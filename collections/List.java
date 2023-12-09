package collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList l= new ArrayList();
     //create new arraylist
        l.add(10);
        l.add(20.34);
        l.add(10);
        l.add(null);
        l.add("java");
        //present in the list
        System.out.println("List=" + l);
        //index size of the list
        System.out.println("List of index size=" + l.size());
        System.out.println("index2 =" + l.get(2));
        //remove index in the list
        l.remove(1);
        System.out.println(l);
        //clear the arraylist
        l.clear();
        System.out.println("list is empty =" +l.isEmpty());
        System.out.println("-------------------------");

        //create another arraylist
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
