package CollectionsPractice;

import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> hm = new TreeMap<>();
        hm.put(100, "sai");
        hm.put(103, "abhi");
        hm.put(102, "ram");
        hm.put(101, "yash");
        hm.put(104, "yash");
        Set s = hm.keySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Object obj = it.next();

            System.out.println(obj + ": " + hm.get(obj));
        }
    }
}
