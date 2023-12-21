package CollectionsPractice;

import java.util.*;

public class StackPractice {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push("wipro");
        stack.push("zoho");
        stack.push("tcs");
        stack.push("accenture");
        stack.push("ovaledge");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
       System.out.println(stack.peek());
        System.out.println(stack.search("tcs"));
        System.out.println(stack.empty());
        stack.clear();
        System.out.println(stack.empty());

    }
}
