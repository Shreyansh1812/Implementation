


public class Reversal_of_LL {
    public class Node {
        int val;
        Node Next;

        public Node(int val) {
            this.val = val;
            this.Next = null;
        }
    }

    private Node Head;

    public void insertatFront(int value) {
        Node newNode = new Node(value);
        if (Head == null) {
            Head = newNode;
        } else {
            newNode.Next = Head;
            Head = newNode;
        }
    }

    public void display() {
        Node temp = Head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.Next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node Current = Head;
        Node Next = null;
        while (Current != null) {
            Next = Current.Next;
            Current.Next = prev;
            prev = Current;
            Current = Next;
        }
        Head = prev;
    }

    public static void main(String[] args) {
        Reversal_of_LL obj = new Reversal_of_LL();
        obj.insertatFront(9);
        obj.insertatFront(8);
        obj.insertatFront(7);
        obj.insertatFront(6);

        System.out.println("Original List:");
        obj.display();

        obj.reverse();

        System.out.println("Reversed List:");
        obj.display();
    }
}


