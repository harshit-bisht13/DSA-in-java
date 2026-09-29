class ListNode {
    int data;
    ListNode next;
    ListNode prev;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public ListNode(int data, ListNode next, ListNode prev) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

public class Removing_a_Node {

    public void deleteGivenNode(ListNode node) {

        if (node == null) {
            return;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        }
    }

    public static void main(String[] args) {

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

        // Delete node 30
        Removing_a_Node solution = new Removing_a_Node();
        solution.deleteGivenNode(third);

        // Print list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}