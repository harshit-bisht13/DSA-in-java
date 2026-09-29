class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;

    public ListNode() {
        data = 0;
        prev = null;
        next = null;
    }

    public ListNode(int data) {
        this.data = data;
        prev = null;
        next = null;
    }

    public ListNode(int data, ListNode prev, ListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

class Solution {

    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {

        // Empty list
        if (head == null) {
            return null;
        }

        ListNode newNode = new ListNode(X);

        // Insert before first node
        if (K == 1) {

            newNode.next = head;
            head.prev = newNode;

            return newNode;
        }

        ListNode temp = head;

        // Find Kth node
        for (int i = 1; i < K; i++) {

            temp = temp.next;

            // K is greater than list length
            if (temp == null) {
                return head;
            }
        }

        // Insert before temp
        newNode.prev = temp.prev;
        newNode.next = temp;

        temp.prev.next = newNode;
        temp.prev = newNode;

        return head;
    }
}

public class Insert_Before_Kth_Position {

    public static void main(String[] args) {

        // Create nodes
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        // Connect nodes
        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        // Insert 25 before 3rd position
        Solution solution = new Solution();
        head = solution.insertBeforeKthPosition(head, 25, 3);

        // Print list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}