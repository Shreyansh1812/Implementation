import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2; // Creation of two Stacks

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();   // Intialising the Stacks like using Constructors
    }

    public void enqueue(int value) {
        stack1.push(value);         // Pushing the Value in the Stack
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {  // Checking  if the Stack is Empty
                System.out.println("Queue is empty");
                return -1;
            }
            // Move elements from stack1 to stack2 to maintain queue order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public void display() {
        if (!stack2.isEmpty()) {
            for (int i = stack2.size() - 1; i >= 0; i--) {
                System.out.print(stack2.get(i) + " ");
            }
        }
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.print("Queue: ");
        queue.display();

        queue.dequeue();
        System.out.print("After dequeue: ");
        queue.display();
    }
}
