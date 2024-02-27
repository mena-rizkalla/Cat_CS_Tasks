package stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {


        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids){
            if (stack.isEmpty()){
                stack.push(asteroid);
            }else if (asteroid > 0){
                if (stack.peek() > 0 || stack.peek() < 0){
                    stack.push(asteroid);
                }else {
                    boolean done = false;
                    while (!stack.isEmpty()){
                        int x = stack.peek();
                        if (x == asteroid*-1){
                            stack.pop();
                            done = true;
                            break;
                        }
                        if (x > asteroid*-1){
                            break;
                        }else {
                            stack.pop();
                        }
                    }
                    if (stack.isEmpty()&&!done)
                        stack.push(asteroid);
                }
            }else {
                boolean done = false;
                if (stack.peek() < 0){
                    stack.push(asteroid);
                }else {
                    while (!stack.isEmpty()){
                        int x = stack.peek();
                        if (x == asteroid*-1){
                            stack.pop();
                            done = true;
                            break;
                        }

                        if (stack.peek() < 0){
                            stack.push(asteroid);
                            break;
                        }

                        if (x >= asteroid*-1){
                            break;
                        }else {
                            stack.pop();
                        }
                    }
                    if (stack.isEmpty()&&!done)
                        stack.push(asteroid);
                }
            }
        }

        int n = stack.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[n-i-1] = stack.pop();
        }

        return arr;
    }
}
