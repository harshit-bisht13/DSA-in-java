class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode prev, ListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

public class Insert_Before_A_Node {

    public void insertBeforeGivenNode(ListNode node, int X) {

        ListNode newNode = new ListNode(X);

        // Connect new node with given node
        newNode.next = node;
        newNode.prev = node.prev;

        // Connect previous node with new node
        if (node.prev != null) {
            node.prev.next = newNode;
        }

        // Connect given node with new node
        node.prev = newNode;
    }

    public static void main(String[] args) {

        // Create nodes
        ListNode head = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);

        // Create links
        head.next = node2;
        node2.prev = head;

        node2.next = node3;
        node3.prev = node2;

        // Given node = 20
        ListNode givenNode = node2;

        // Create object
        Insert_Before_A_Node obj = new Insert_Before_A_Node();

        // Insert 15 before 20
        obj.insertBeforeGivenNode(givenNode, 15);

        // Print the list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}