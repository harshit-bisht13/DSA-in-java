class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

public class Reverse_the_LL_in_the_Group_of_K{

    public static ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1) {
            return head;
        }

        ListNode temp = head;

        // Check whether k nodes are available
        int count = 0;

        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // Less than k nodes remain
        if (count < k) {
            return head;
        }

        // Reverse first k nodes
        ListNode prev = null;
        ListNode curr = head;

        for (int i = 0; i < k; i++) {
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        // head is now the last node of reversed group
        head.next = reverseKGroup(curr, k);

        return prev;
    }

    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        int k = 3;

        System.out.println("Original List:");
        printList(head);

        head = reverseKGroup(head, k);

        System.out.println("After reversing in groups of " + k + ":");
        printList(head);
    }
}