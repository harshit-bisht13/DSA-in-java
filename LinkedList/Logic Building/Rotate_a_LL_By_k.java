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

public class Rotate_a_LL_By_k{

    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length
        int length = 0;
        ListNode tail = head;

        while (tail != null) {
            length++;
            tail = tail.next;
        }

        // Avoid unnecessary rotations
        k = k % length;

        if (k == 0) {
            return head;
        }

        // Find the new last node
        ListNode newLastNode = findNthNode(head, length - k);

        // Node after new last becomes new head
        ListNode newHead = newLastNode.next;

        // Break the list
        newLastNode.next = null;

        // Connect old tail to old head
        tail = newHead;

        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head;

        return newHead;
    }

    public static ListNode findNthNode(ListNode head, int n) {

        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp = temp.next;
        }

        return temp;
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

        // Create:
        // 1 -> 2 -> 3 -> 4 -> 5

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.println("Original List:");
        printList(head);

        head = rotateRight(head, k);

        System.out.println("After rotating right by " + k + ":");
        printList(head);
    }
} 
