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

public class Delete_the_Middle_Node {

    public static ListNode deleteMiddle(ListNode head) {

        // Empty list or single node
        if (head == null || head.next == null) {
            return null;
        }

        // Count the nodes
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Find middle position
        // For even length, this gives the second middle
        int mid = count / 2 + 1;

        // Move to the node before middle
        temp = head;

        for (int i = 1; i < mid - 1; i++) {
            temp = temp.next;
        }

        // Delete middle node
        temp.next = temp.next.next;

        return head;
    }

    // Print linked list
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

        System.out.println("Original List:");
        printList(head);

        head = deleteMiddle(head);

        System.out.println("After deleting middle:");
        printList(head);
    }
}