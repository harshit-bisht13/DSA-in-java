class Node {
    int data;
    Node next;

    // Constructor with data and next node
    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data
    public Node(int data1) {
        data = data1;
        next = null;
    }
}

public class InsertAt_The_Head {

    // Insert a new node at the beginning
    public Node insertAtHead(Node head, int data) {

        // Create a new node
        Node newNode = new Node(data, head);

        // New node becomes the head
        return newNode;
    }

    // Print the linked list
    public void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        InsertAt_The_Head i = new InsertAt_The_Head();

        // Creating linked list: 2 -> 3 -> null
        Node head = new Node(2);
        head.next = new Node(3);

        System.out.print("Original List: ");
        i.printList(head);

        // Insert 1 at the head
        head = i.insertAtHead(head, 1);

        System.out.print("After Insertion at Head: ");
        i.printList(head);
    }
}