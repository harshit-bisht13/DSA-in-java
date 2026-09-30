class ListNode {
    int data;
    ListNode prev;
    ListNode next;

    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}

public class Reverse_DLL {

    public ListNode reverseDLL(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode temp = head;
        ListNode newHead = null;

        while (temp != null) {

            ListNode nextNode = temp.next;

            // Swap prev and next
            temp.next = temp.prev;
            temp.prev = nextNode;

            // Current node becomes new head
            newHead = temp;

            // Move to next node of original list
            temp = nextNode;
        }

        return newHead;
    }

    public static void main(String[] args) {

        // Create doubly linked list
        ListNode head = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);

        // Connect nodes
        head.next = node2;
        node2.prev = head;

        node2.next = node3;
        node3.prev = node2;

        node3.next = node4;
        node4.prev = node3;

        // Create object
        Reverse_DLL obj = new Reverse_DLL();

        // Reverse the doubly linked list
        head = obj.reverseDLL(head);

        // Print reversed list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}