import java.util.*;
public class stack {
    public static void main(String[] args){
        System.out.println("Push the Element");
            Stack<Integer> s = new Stack<>();
            s.push(56);
            s.push(30);
            s.push(70);
            s.push(100);

        System.out.println(s);
        System.out.println("");

        System.out.println("Pop the Element");
        s.pop();
        System.out.println(s);
        System.out.println("");

        System.out.println("Peek the Element");
        System.out.println(s.peek());


        System.out.println("Peek all the Element");
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }




    }
    }
