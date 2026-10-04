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

public class LL_is_Pallindrome_Or_not {

    public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find middle of the linked list
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse the second half
        ListNode newHead = reverse(slow.next);

        ListNode first = head;
        ListNode second = newHead;

        // Compare both halves
        while (second != null) {

            if (first.val != second.val) {
                // Restore original list
                slow.next = reverse(newHead);
                return false;
            }

            first = first.next;
            second = second.next;
        }

        // Restore original list
        slow.next = reverse(newHead);

        return true;
    }

    // Reverse a linked list
    public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {

            ListNode front = temp.next;

            temp.next = prev;

            prev = temp;
            temp = front;
        }

        return prev;
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

        // 1 -> 2 -> 3 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.println("Original List:");
        printList(head);

        boolean result = isPalindrome(head);

        System.out.println("Is Palindrome: " + result);

        System.out.println("List After Checking:");
        printList(head);
    }
}