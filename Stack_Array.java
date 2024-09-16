public class Stack_Array {
    private int top;
    private int capacity;
    private int[] stackArray;

    public Stack_Array(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1; // Stack is initially empty
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack is full.");
        } else {
            stackArray[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1; // Return a default value indicating an empty stack
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_Array stack = new Stack_Array(5); // Create a stack with capacity of 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        stack.display();
    }
}
