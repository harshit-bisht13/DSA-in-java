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

public class Length_of_Loop {

    public static int lengthOfLoop(ListNode head) {

        if (head == null || head.next == null) {
            return 0;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            // Cycle found
            if (slow == fast) {

                // Phase 2: Count cycle length
                int count = 1;
                ListNode temp = slow.next;

                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }

                return count;
            }
        }

        // No cycle
        return 0;
    }

    public static void main(String[] args) {

        /*
            1 → 2 → 3 → 4 → 5
                    ↑         ↓
                    ← ← ← ← ←

            Cycle: 3 → 4 → 5 → 3

            Length = 3
        */

        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create loop: 5 → 3
        head.next.next.next.next.next = head.next.next;

        int length = lengthOfLoop(head);

        System.out.println("Length of loop: " + length);
    }
} 
