class ListNode {
    int val;
    ListNode next;
    ListNode(int data) { 
        val = data; 
        next = null; 
    }
}

public class Reverse_A_LL {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        // Traverse nodes and reverse one link per step.
        while (current != null) {
            ListNode front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }
        return prev;
    }

    // Helper to build a linked list from an array
    static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new ListNode(arr[i]);
            tail = tail.next;
        }
        return head;
    }

    // Helper to print the linked list
    static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = buildList(arr);

        System.out.print("Original list: ");
        printList(head);

        Reverse_A_LL obj = new Reverse_A_LL();
        head = obj.reverseList(head);

        System.out.print("Reversed list: ");
        printList(head);
    }
}
