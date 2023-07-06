package ch11;

import java.util.Stack;

public class S05 {
    public static void main(String[] args) {
        // Stack은 나중에 들어온 값이 먼저 나간다.
        // 선입후출
        Stack<String> stack = new Stack<String>();
        

        stack.push("사과");
        stack.push("바나나");
        stack.push("멜론");

        System.out.println(stack);

        stack.pop();
        
        System.out.println(stack); 

        // pop 된 값만 출력하고 싶은데 안되네
        // String poppedValue = stack.pop();
        // System.out.println("Popped Value: " + poppedValue);
        // System.out.println(stack.pop());

        System.out.println(stack); 
    }
}
