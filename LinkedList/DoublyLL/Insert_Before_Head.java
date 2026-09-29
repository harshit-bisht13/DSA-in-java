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

public class Insert_Before_Head {

    public ListNode insertBeforeHead(ListNode head, int data) {

        ListNode newNode = new ListNode(data);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head.prev = newNode;

        return newNode;
    }
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

        // Insert 5 before head
        Insert_Before_Head solution = new Insert_Before_Head();
        head = solution.insertBeforeHead(head, 5);

        // Print list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }    
}
