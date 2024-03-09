package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStacksingQueues {
    Queue<Integer> stack = new ArrayDeque<>();

    public ImplementStacksingQueues() {

    }

    public void push(int x) {
        Queue<Integer> temp = new ArrayDeque<>();
        while (!stack.isEmpty()){
            temp.add(stack.remove());
        }
        stack.add(x);
        while (!temp.isEmpty()){
            stack.add(temp.remove());
        }
    }

    public int pop() {
        return stack.remove();
    }

    public int top() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
