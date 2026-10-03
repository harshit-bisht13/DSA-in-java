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

public class Find_the_Mid {

    public static ListNode middleOfLinkedList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        // Count the number of nodes
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Find middle position
        // For even length, this gives the second middle
        int mid = count / 2 + 1;

        // Move to the middle node
        temp = head;

        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }

        return temp;
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
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println("Linked List:");
        printList(head);

        ListNode middle = middleOfLinkedList(head);

        System.out.println("Middle Node: " + middle.val);
    }
}