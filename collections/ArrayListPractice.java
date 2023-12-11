import java.util.*;

public class ArrayListPractice {
    public static void main(String args[]) {
        Integer[] arr = new Integer[] {1,2,3,4};
        ArrayList<Integer> AL1 = new ArrayList<Integer>(Arrays.asList(arr));
        AL1.add(5);
        System.out.println(AL1);
        
        ArrayList<Integer> AL2 = new ArrayList<Integer>(Arrays.asList(arr));
        AL2.add(5);
        AL2.add(8);
        AL2.add(9);
        AL2.add(4);
        AL2.add(2);

        AL1.addAll(AL2);

        Collections.synchronizedList(AL1);//Making ArrayList to synchronized

        AL1.set(2, 6);
        AL1.remove(4);
        System.out.println(AL1);
        System.out.println(AL1.get(7));
        System.out.println(AL1.contains(7));
        System.out.println(AL1.containsAll(AL1));
        /*for(int i = 0; i<AL1.size(); i++) {
            System.out.println(AL1.get(i));
        }*/
        for (Integer integer : AL2) {
            System.out.println(integer);
        }

        Object array[] = AL1.toArray();
        System.out.println(Arrays.toString(array));
        //What is the default capacity........0
        //What is the initial capacity........10
        //Does it allows duplicate ele........yes
        //Does it allows Null values..........yes
        //Does it maintain the insertion order........yes
        //Does it maintain the sorted order...........No
        //Does it offer random access of ele..........yes
        //Is it synchronized..................By default No but using COLLECTIONS class we can make it
        //What it is good at..................It is good to use when the data is not inc exponentially
    }
}
