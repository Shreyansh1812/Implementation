public class Queue_Array {
    private int[] queue;
    int capacity;
    int rear;
    int front;

    public Queue_Array(int size) {
        queue = new int[size];
        capacity = size;
        rear = -1;
        front = -1;
    }

    // Enqueue method to add an element to the queue
    public void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;  // Initialize front when the first element is added
            }
            queue[++rear] = value;
            System.out.println("Enqueued: " + value);
        }
    }

    // Dequeue method to remove an element from the queue
    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int dequeuedValue = queue[front++];
            System.out.println("Dequeued: " + dequeuedValue);
            return dequeuedValue;
        }
    }

    // Display method to show the elements of the queue
    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a queue with a capacity of 5
        Queue_Array queue = new Queue_Array(5);

        // Enqueue elements into the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);  // This should print "Queue is full"

        // Display the queue
        queue.display();

        // Dequeue elements from the queue
        queue.dequeue();
        queue.dequeue();

        // Display the queue after dequeuing
        queue.display();

        // Enqueue more elements to check if queue still works
        queue.enqueue(60);
        queue.display();
    }
}
