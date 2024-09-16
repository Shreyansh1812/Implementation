public class Stack_LinkedList {
    
    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null; // Initialize the next pointer to null
        }
    }

    private Node top;

    public Stack_LinkedList() {
        top = null; // Initialize the stack as empty
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top; // Point new node to the current top node
        top = newNode; // Update top to be the new node
    }

    public int pop() {
        if (top == null) {
            return -1; // Return -1 if the stack is empty
        }
        int value = top.value;
        top = top.next; // Update top to the next node
        return value;
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next; // Move to the next node
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_LinkedList stack = new Stack_LinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display(); // Display stack elements

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        stack.display(); // Display remaining stack elements
    }
}
