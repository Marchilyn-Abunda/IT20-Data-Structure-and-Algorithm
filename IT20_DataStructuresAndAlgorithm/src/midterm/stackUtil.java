package midterm;

import java.util.Stack;

public class stackUtil {

    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();

        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);

        System.out.println(mystack.pop());
        System.out.println(mystack.size());

    }

}
