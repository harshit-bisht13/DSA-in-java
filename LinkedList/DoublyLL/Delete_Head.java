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

public class Delete_Head {

    public ListNode deleteHead(ListNode head) {

        // If list is empty
        if (head == null) {
            return null;
        }

        // If list has only one node
        if (head.next == null) {
            return null;
        }

        ListNode temp = head;

        // Move to the next node
        temp = temp.next;

        // Remove previous link
        temp.prev = null;

        // Update head
        head = temp;

        return head;
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

        // Create object
        Delete_Head obj = new Delete_Head();

        // Delete head
        head = obj.deleteHead(head);

        // Print the list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
} 
