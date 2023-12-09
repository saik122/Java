package collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList list= new ArrayList();
     //create new arraylist
        list.add(10);
        list.add(20.34);
        list.add(10);
        list.add(null);
        list.add("java");
        //present in the list
        System.out.println("List=" + list);
        //index size of the list
        System.out.println("List of index size=" + list.size());
        System.out.println("index2 =" + list.get(2));
        //remove index in the list
        list.remove(1);
        System.out.println(list);
        //clear the arraylist
        list.clear();
        System.out.println("list is empty =" +list.isEmpty());
        System.out.println("-------------------------");

        //create another arraylist
        ArrayList list2= new ArrayList();
        list2.add(145);
        list2.add(25);
        list2.add(784);
        list2.add(null);
        list2.add(48.24);
        System.out.println("List2=" + list2);
        System.out.println("index number = "+ list2.indexOf(784));
        System.out.println("index number = "+ list2.indexOf(25));
        System.out.println("last index = "+ list2.lastIndexOf(48.24));


    }
}
