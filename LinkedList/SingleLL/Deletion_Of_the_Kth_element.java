class ListNode {
    int data;
    ListNode next;

    // Constructor with data and next node
    public ListNode(int data1, ListNode next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data
    public ListNode(int data1) {
        data = data1;
        next = null;
    }
}

public class Deletion_Of_the_Kth_element {

    public ListNode delete(ListNode head, int k) {

        if (head == null) {
            return null;
        }

        if (k == 1) {
            return head.next;
        }

        ListNode temp = head;
        int count = 1;

        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            return head;
        }

        temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 3;

        Deletion_Of_the_Kth_element obj =
                new Deletion_Of_the_Kth_element();

        head = obj.delete(head, k);

        // Print linked list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}