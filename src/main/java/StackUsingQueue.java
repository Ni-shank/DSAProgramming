import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private final Queue<Integer> queue = new LinkedList<>();

    public void push(int value) {
        queue.add(value);
        int size = queue.size();

        for (int i = 1; i < size; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Push: 10, 20, 30");
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
    }
}
