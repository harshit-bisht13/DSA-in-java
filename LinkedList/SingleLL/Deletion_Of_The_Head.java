class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class Deletion_Of_The_Head {

    public static ListNode deleteHead(ListNode head) {

        if (head == null) {
            return null;
        }

        head = head.next;

        return head;
    }

    public static void traverse(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        System.out.println("Before deletion:");
        traverse(head);

        head = deleteHead(head);

        System.out.println("\nAfter deletion:");
        traverse(head);
    }
}