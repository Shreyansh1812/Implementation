public class SLL {
    private Node Head;

    public void insertatFront(int x) {
        Node NewNode = new Node(x);
        if (Head == null) {
            Head = NewNode;
        } else {
            NewNode.next = Head;
            Head = NewNode;
        }
    }

    public void insertatLast(int x) {
        Node NewNode = new Node(x);
        if (Head == null) {
            Head = NewNode;
        } else {
            Node temp = Head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = NewNode;
        }
    }
    public void deleteatFront()
    {
        if(Head==null)
        {
            System.out.println("Linked List Is Empty");
        }
        Head=Head.next;
    }
    public void deleteatLast()
    {
        Node temp=Head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
   public void InsertatIndex(int val,int index)
   {
    Node Temp=Head;
    for(int i=1;i<index;i++)
    {
        Temp=Temp.next;
    }
    Node node=new Node(val, Temp.next);
    Temp.next=node;
   }
   public void DeleteatIndex(int index)
   {
    Node prev=get(index-1);
    prev.next=prev.next.next;
   }
   public Node  get (int index)
   {
    Node temp=Head;
    for(int i=0;i<index;i++)
    {
       temp=temp.next;
    }
    return temp;
   }

    // Method to display the elements of the list
    public void display() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node {
        int value;
        Node next;

        Node(int x) {
            this.value = x;
            this.next = null;
        }

        Node(int value, Node nextNode) {
            this.value = value;
            this.next = nextNode;
        }
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        
        // Insert elements at the front
        list.insertatFront(10);
        list.insertatFront(20);
        list.insertatFront(30);

        // Insert elements at the end
        list.insertatLast(40);
        list.insertatLast(50);
        //list.deleteatFront();
        //list.deleteatLast();
        list.InsertatIndex(7, 3);
        list.DeleteatIndex(3);

        // Print the list to verify the insertions
        list.display();

    }
}
