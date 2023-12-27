package Strings;



public class Stringbuilder {
    public static void main(String[] args) {
        String name="saikumar  ";
        for(int i =name.length() -1; i>=0; i--){
           name+= name.charAt(i);
        }
        System.out.println(name);


    }
}


