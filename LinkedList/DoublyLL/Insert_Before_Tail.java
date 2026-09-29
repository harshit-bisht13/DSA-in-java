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

    public ListNode insertBeforeTail(ListNode head, int X) {

        if (head == null) {
            return new ListNode(X);
        }

        // Only one node
        if (head.next == null) {
            ListNode newNode = new ListNode(X);

            newNode.next = head;
            head.prev = newNode;

            return newNode;
        }

        // Find tail
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Create new node
        ListNode newNode = new ListNode(X);

        // Insert before tail
        newNode.prev = temp.prev;
        newNode.next = temp;

        temp.prev.next = newNode;
        temp.prev = newNode;

        return head;
    }
}

public class Insert_Before_Tail {

    public static void main(String[] args) {

        // Create nodes
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        // Connect nodes
        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        // Insert 25 before tail
        Solution solution = new Solution();
        head = solution.insertBeforeTail(head, 25);

        // Print list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}