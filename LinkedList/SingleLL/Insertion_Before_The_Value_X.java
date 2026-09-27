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

public class Insertion_Before_The_Value_X {

    public ListNode insertBeforeX(ListNode head, int X, int val) {

        // If list is empty
        if (head == null) {
            return null;
        }

        // If X is the first node
        if (head.data == X) {
            return new ListNode(val, head);
        }

        ListNode temp = head;

        // Find the node before X
        while (temp.next != null) {

            if (temp.next.data == X) {
                ListNode newNode = new ListNode(val);

                newNode.next = temp.next;
                temp.next = newNode;

                return head;
            }

            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        Insertion_Before_The_Value_X obj =
                new Insertion_Before_The_Value_X();

        // Insert 25 before 30
        head = obj.insertBeforeX(head, 30, 25);

        // Print linked list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}