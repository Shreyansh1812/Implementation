import java.util.Scanner;

public class DLL {
    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    public  void deleteatFront()
    {
        if(head==null)
        {
            System.out.println("The Linked List is Empty");
        }
        head=head.next;
        head.prev=null;
    }
    public void deleteatLast()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.prev.next=null; // If you just Keep  temp.next = null, you will lose the reference to the last node in the list


    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
    

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        DLL dll = new DLL();
        boolean running = true;

        while (running) {
            System.out.println("Doubly Linked List Menu:");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert after a specific value");
            System.out.println("4. Display the list");
            System.out.println("5. Find a value");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at the beginning: ");
                    int insertFirstVal = scanner.nextInt();
                    dll.insertFirst(insertFirstVal);
                    break;
                case 2:
                    System.out.print("Enter value to insert at the end: ");
                    int insertLastVal = scanner.nextInt();
                    dll.insertLast(insertLastVal);
                    break;
                case 3:
                    System.out.print("Enter value to insert after: ");
                    int afterVal = scanner.nextInt();
                    System.out.print("Enter value to insert: ");
                    int insertVal = scanner.nextInt();
                    dll.insert(afterVal, insertVal);
                    break;
                case 4:
                    System.out.println("Doubly Linked List:");
                    dll.display();
                    break;
                case 5:
                    System.out.print("Enter value to find: ");
                    int findVal = scanner.nextInt();
                    DLL.Node foundNode = dll.find(findVal);
                    if (foundNode != null) {
                        System.out.println("Value " + findVal + " found.");
                    } else {
                        System.out.println("Value " + findVal + " not found.");
                    }
                    break;
                case 6:
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
