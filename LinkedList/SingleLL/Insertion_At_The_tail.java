class ListNode {

    public int data;
    public ListNode next;

    ListNode() {
        data = 0;
        next = null;
    }

    ListNode(int x) {
        data = x;
        next = null;
    }

    ListNode(int x, ListNode next) {
        data = x;
        this.next = next;
    }
}

public class Insertion_At_The_tail {

    class Solution {

        public ListNode insertAtTail(ListNode head, int X) {

            ListNode newNode = new ListNode(X);

            // If linked list is empty
            if (head == null) {
                return newNode;
            }

            // Traverse to the last node
            ListNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            // Insert new node at the tail
            temp.next = newNode;

            return head;
        }
    }

    public static void main(String[] args) {

        // Create linked list: 10 -> 20 -> 30
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);

        // Value to insert
        int X = 40;

        // Create outer class object
        Insertion_At_The_tail obj = new Insertion_At_The_tail();

        // Create Solution object
        Solution solution = obj.new Solution();

        // Insert X at the tail
        head = solution.insertAtTail(head, X);

        // Print linked list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}