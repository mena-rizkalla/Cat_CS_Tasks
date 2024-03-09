package queue;

import java.util.Stack;

public class ImplementQueueusingStacks {
    Stack<Integer> queue = new Stack<Integer>();

    public void ImplementStacksingQueues(){

    }

    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!queue.isEmpty()){
            temp.push(queue.pop());
        }
        queue.push(x);
        while(!temp.empty()){
            queue.push(temp.pop());
        }

    }

    public int pop() {
        return queue.pop();
    }

    public int peek() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
