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

public class FindStart {

    public static ListNode findStartingPoint(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Phase 2: Find starting point
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        /*
              1 → 2 → 3 → 4 → 5
                      ↑         ↓
                      ← ← ← ← ←
              
              Loop starts at node 3
        */

        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create loop:
        // 5 → 3
        head.next.next.next.next.next = head.next.next;

        ListNode result = findStartingPoint(head);

        if (result != null) {
            System.out.println("Loop starts at node: " + result.val);
        } else {
            System.out.println("No loop found");
        }
    }
}