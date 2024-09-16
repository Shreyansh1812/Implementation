
import java.util.*;

public class Stack_Queue {
    public Queue<Integer> queue1 = new LinkedList<>();
    public Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x) {
        queue1.offer(x);
    }

    public int pop() {
        if (queue1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            int pooped = queue1.poll();
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return pooped;
        }
        
    }

    public void display() {
        for (int element : queue1) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_Queue s = new Stack_Queue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display(); // prints: 1 2 3
        s.pop();
        s.display(); // prints: 1 2
    }
}
