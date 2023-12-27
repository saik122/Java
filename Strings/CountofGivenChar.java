package Strings;

public class CountofGivenChar {
    public static void main(String[] args) {
     String name = "yashwanth";
     int[]times=new int[200];
     for(int i=0;i<name.length();i++){
         times[name.charAt(i)]++;
     }
     for(int i=0; i<times.length ;i++){
         if(times[i]>0){
             System.out.println(""+(char)i +" = "+  times[i]+" times");
         }
     }
    }
}

