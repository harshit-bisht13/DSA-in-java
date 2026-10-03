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

public class Adding_1_t0_a_LL_using_Reversal {

    public static ListNode addOne(ListNode head) {

        if (head == null) {
            return null;
        }

        // Step 1: Reverse the linked list
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        head = prev;

        // Step 2: Add 1
        temp = head;
        int carry = 1;

        while (temp != null) {

            temp.val = temp.val + carry;

            if (temp.val < 10) {
                carry = 0;
                break;
            } else {
                temp.val = 0;
                carry = 1;
            }

            temp = temp.next;
        }

        // Step 3: Reverse the list again
        temp = head;
        prev = null;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        head = prev;

        // Step 4: If carry is still 1
        if (carry == 1) {
            ListNode newNode = new ListNode(1);
            newNode.next = head;
            head = newNode;
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

        // 1 -> 2 -> 9
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(9);

        System.out.println("Original list:");
        printList(head);

        head = addOne(head);

        System.out.println("After adding 1:");
        printList(head);
    }
}