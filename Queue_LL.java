public class Queue_LL {

    // Inner class representing the Node structure
    public class Node {
        int value;  // Data of the node
        Node next;  // Pointer to the next node

        // Constructor to initialize node with a value
        public Node(int value) {
            this.value = value; // Initializing value
            this.next = null;   // Initially, next is set to null
        }
    }

    private Node front;  // Points to the front of the queue
    private Node rear;   // Points to the rear of the queue

    // Constructor to initialize an empty queue
    public Queue_LL() {
        front = null;   // Initially, front is null
        rear = null;    // Initially, rear is null
    }

    // Method to add an element to the queue (enqueue)
    public void enqueue(int value) {
        Node newNode = new Node(value);  // Create a new node with the value
        if (rear == null) {              // If queue is empty
            rear = front = newNode;      // Both front and rear point to the new node
        } else {
            rear.next = newNode;         // Attach new node to the end of the queue
            rear = newNode;              // Move rear to the new node
        }
    }

    // Method to remove an element from the queue (dequeue)
    public int dequeue() {
        if (front == null) {             // If queue is empty
            System.out.println("Queue is Empty");
            return -1;                   // Return -1 if the queue is empty
        } else {
            int value = front.value;     // Get the value from the front node
            front = front.next;          // Move the front to the next node
            if (front == null) {         // If front becomes null, set rear to null as well
                rear = null;
            }
            return value;                // Return the dequeued value
        }
    }

    // Method to display the elements of the queue
    public void display() {
        if (front == null) {             // If the queue is empty
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;               // Temporary node for traversal
        while (temp != null) {           // Traverse the queue
            System.out.print(temp.value + " ");  // Print the value of each node
            temp = temp.next;            // Move to the next node
        }
        System.out.println();
    }

    // Main method to test the queue implementation
    public static void main(String[] args) {
        Queue_LL q = new Queue_LL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.print("Queue: ");
        q.display();     // Display the queue: 1 2 3 4

        q.dequeue();     // Dequeue 1
        q.dequeue();     // Dequeue 2
        System.out.print("After dequeue: ");
        q.display();     // Display the queue: 3 4
    }
}
