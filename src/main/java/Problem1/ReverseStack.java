package Problem1;

import java.util.Stack;

public class ReverseStack {

    public static void reverseStack(Stack<Integer> stack) {

        if (stack.isEmpty() == false) {

            //pop out all the items from the stack and store it in function stack
            int x = stack.pop();
            reverseStack(stack);

            //now insert the items into stack in reversed order
            //last item popped from the stack
            insert_at_bottom(stack, x);
        }
    }

    private static void insert_at_bottom(Stack<Integer> stack, int x) {

        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int y = stack.pop();
        insert_at_bottom(stack, x);

        stack.push(y);
    }
}
