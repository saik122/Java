import java.util.*;
public class LinkedListPractice {
    public static void main(String[] args) {
        ArrayList<String> AL = new ArrayList<>();
        AL.add("Vinay");
        AL.add("Shabbir");

        LinkedList<String> LL = new LinkedList<>();
        LL.add("Yash");
        LL.add("vikram");
        LL.add("Pula");
        LL.add(1, "Sai");
        LL.addAll(AL);
        System.out.println(LL);
        System.out.println(LL.containsAll(AL));
        LL.removeAll(AL);
        System.out.println(LL.get(1));
        System.out.println(LL.contains("Yash"));
        LL.set(0, "Yaswanth");
        System.out.println(LL);

        for (String s : LL) {
            System.out.println(s);
        }

        //What is the default capacity........0
        //What is the initial capacity........0
        //Does it allows duplicate ele........yes
        //Does it allows Null values..........yes
        //Does it maintain the insertion order........yes
        //Does it maintain the sorted order...........No
        //Does it offer random access of ele..........yes
        //Is it synchronized..................By default 'NOT' but we can make it by using COLLECTIONS class
        //What it is good at..................Data manipulation in middle of data

    }
    
}
