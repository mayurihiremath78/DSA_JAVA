import java.util.*;
public class Stack_BuiltIn {

    public static void main(String args[])
    {
        Stack<Integer> s= new Stack<>();  
        
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.pop();
        System.out.println(s);
        s.push(20);
        s.push(30);
        int x=s.peek();
        System.out.println(x);
    }
}
