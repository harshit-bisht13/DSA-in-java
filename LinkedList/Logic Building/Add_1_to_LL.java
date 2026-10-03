class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data) {
        val = data;
        next = null;
    }

    ListNode(int data, ListNode next) {
        val = data;
        next = next;
    }
}

public class ADD_1_to_LL{

    public static ListNode addOne(ListNode head) {

        if (head == null) {
            return null;
        }

        // Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Find the rightmost node which is not 9
        ListNode lastNonNine = dummy;
        ListNode temp = head;

        while (temp != null) {

            if (temp.val != 9) {
                lastNonNine = temp;
            }

            temp = temp.next;
        }

        // Add 1 to the rightmost non-9 node
        lastNonNine.val++;

        // Set all nodes after it to 0
        temp = lastNonNine.next;

        while (temp != null) {
            temp.val = 0;
            temp = temp.next;
        }

        // If all original digits were 9
        if (dummy.val == 1) {
            return dummy;
        }

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

        // 1 -> 3 -> 9 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(2);

        System.out.println("Original:");
        printList(head);

        head = addOne(head);

        System.out.println("After adding 1:");
        printList(head);
    }
}