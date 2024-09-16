import java.util.Scanner;

public class CLL {

    private Node head;

    public CLL() {
        this.head = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            node.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }
    }

    public void display() {
        if (head != null) {
            Node node = head;
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val) {
        if (head == null) {
            return;
        }

        Node node = head;

        // Case 1: If the list has only one node and it's the node to be deleted
        if (node.val == val && node.next == head) {
            head = null;
            return;
        }

        // Case 2: If the node to be deleted is the head node
        if (node.val == val) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
            return;
        }

        // Case 3: Deleting a non-head node
        Node prev = null;
        do {
            prev = node;
            node = node.next;
            if (node.val == val) {
                prev.next = node.next;
                return;
            }
        } while (node != head);
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CLL cll = new CLL();
        boolean running = true;

        while (running) {
            System.out.println("Circular Linked List Menu:");
            System.out.println("1. Insert a value");
            System.out.println("2. Display the list");
            System.out.println("3. Delete a value");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertVal = scanner.nextInt();
                    cll.insert(insertVal);
                    break;
                case 2:
                    System.out.println("Circular Linked List:");
                    cll.display();
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    int deleteVal = scanner.nextInt();
                    cll.delete(deleteVal);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
