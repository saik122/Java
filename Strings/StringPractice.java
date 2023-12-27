package Strings;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
      String name=" saikumar ";
      String s=new String("abhi");
        String s2=new String("ABHI");
      System.out.println(name.charAt(5));
        System.out.println(name.lastIndexOf("u"));
        System.out.println(name.contains("mar"));
        System.out.println(name.length());
        System.out.println(name.endsWith("r"));
        System.out.println(name.startsWith("s"));
        System.out.println(s);
        System.out.println(s.replace("abhi","abhiram"));
        System.out.println(name.repeat(5));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(" penagalur"));
        System.out.println(name.substring(2,7));
        System.out.println(name.equals(s));
        System.out.println(s2.equalsIgnoreCase(s));
        System.out.println(s2.isEmpty());
        System.out.println(name);
        System.out.println(name.trim());
      System.out.println(Arrays.toString(name.split("")));
    }
}
