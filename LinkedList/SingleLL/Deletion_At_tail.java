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

public class Deletion_At_tail {

    public ListNode delete(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        ListNode temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    public void printList(ListNode head) {
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

        Deletion_At_tail obj = new Deletion_At_tail();

        System.out.println("Before deletion:");
        obj.printList(head);

        head = obj.delete(head);

        System.out.println("\nAfter deletion:");
        obj.printList(head);
    }
}

