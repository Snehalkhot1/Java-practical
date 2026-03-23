// program to demonstrate stack and queue
import java.util.*;
public class StackQueueExample {
    public static void main(String[] args) {
        // Stack example
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack elements (LIFO):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Queue example
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue elements (FIFO):");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}