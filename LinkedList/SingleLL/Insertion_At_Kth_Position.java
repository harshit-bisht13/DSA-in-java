class ListNode {
    int data;
    ListNode next;

    ListNode(int value) {
        this.data = value;
        this.next = null;
    }
}

public class Insertion_At_Kth_Position {

    public ListNode insertAtKthPosition(ListNode head, int k, int value) {

        ListNode newNode = new ListNode(value);

        // Insert at first position
        if (k == 1) {
            newNode.next = head;
            return newNode;
        }

        ListNode temp = head;

        // Reach (k-1)th node
        for (int i = 1; i < k - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null) {
            return head;
        }

        // Insert node
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static void main(String[] args) {

        // Creating Linked List
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        Insertion_At_Kth_Position obj = new Insertion_At_Kth_Position();

        // Insert 25 at 3rd position
        head = obj.insertAtKthPosition(head, 3, 25);

        // Print Linked List
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}